package termometropack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.EventListener;
import java.util.EventObject;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.Timer;

/**
 * @author ROZER
 */
public class Termometro extends JLabel implements Serializable, ActionListener {

    double avisoFrio = 0.00;
    double avisoCalor = 40.00;

    double temperatura;
    boolean celsius = true;

    int actualizacion = 1;
    Timer t;
    Font font;
    TemperaturaListener listener;

    DecimalFormat df = new DecimalFormat("#0.00");

    /**
     * Constructor vacio que crea un objeto termometro
     */
    public Termometro() {
        //generamos la temperatura aleatoriamente entre 0 y 40
        temperatura = (Math.random() * avisoCalor + avisoFrio);

        //Establecemos el formato al texto
        font = new Font("Times New Roman", Font.PLAIN, 20);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        //Creamos objeto Timer y lo iniciamos
        this.t = new Timer((actualizacion * 1000), null);
        this.t.start();
        t.addActionListener(this);

    }

    /**
     * Devolvemos la temperatura
     *
     * @return
     */
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Devolvemos true o false en funcion si la temperatura está en celsius o
     * fahrenheit
     *
     * @return
     */
    public boolean isCelsius() {
        return celsius;
    }

    /**
     * Establecemos si la teperatura se mide en celseius o no dependediendo si
     * lo ponemos en true o false.
     *
     * @param celsius
     */
    public void setCelsius(boolean celsius) {

// Se deberá adaptar la temperatura mostrada y los avisos a la escala seleccionada.
// Si celsius es true estaremos trabajando en escala Celsius.
// Si celsius es false estaremos trabajando en escala Fahrenheit.
// Si estamos trabajando en Celsius y elegimos cambiar a Fahrenheit.  
        if (this.celsius && !celsius) {
            temperatura = (temperatura * 9 / 5.0) + 32;
            avisoCalor = (avisoCalor * 9 / 5.0) + 32;
            avisoFrio = (avisoFrio * 9 / 5.0) + 32;
        }

// Si estamos trabajando en Fahrenheit y elegimos cambiar a Celsius.
        if (!this.celsius && celsius) {
            temperatura = (temperatura - 32) * 5 / 9.0;
            avisoCalor = (avisoCalor - 32) * 5 / 9.0;
            avisoFrio = (avisoFrio - 32) * 5 / 9.0;
        }

// Finalmente establecemos la escala seleccionada (Celsius o Fahrenheit)
        this.celsius = celsius;
    }

    /**
     * Recuperamos el tiempo de la actualización.
     *
     * @return
     */
    public int getActualizacion() {
        return actualizacion;
    }

    /**
     * Método con el que podemos cambiar el tiempo de la actualización
     *
     * @param actualizacion
     */
    public void setActualizacion(int actualizacion) {
        this.actualizacion = actualizacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Devolvemos número aleatorio entre 0 y 1. Si es 0 aumenta temp si es 1 baja la temp
//        int tipoincremento = (int) (Math.random());

/*En general, para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula
  int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.*/

        int tipoincremento = (int) Math.floor(Math.random()*(1-0+1)+0);

        // Devolvemos número aleatorio entre 0.0 y 1.0 para cambiar la temperatura
        double cambio = Math.random();

        if (tipoincremento == 0) {
            temperatura += cambio;
        } 
        if(tipoincremento == 1) {
            temperatura -= cambio;
        }

        /*
        Si la temperatura alcanza los 40ºC enviamos mensaje por ola de calor y etablecemos el 
        color del texto en rojo. En el caso de la temperatura ponerse a 0ºC  enviamos mensaje
        con aviso por baja temperatura y establecemos el texto del termometro en azul, mientras
        que si el termóetro está entre los 0ºC y los 40ºC establecemos el texto en negro.
         */
        if (temperatura >= avisoCalor) {
            //Establecer el texto color rojo
            this.setForeground(Color.RED);
            listener.avisoFrio(new TemperaturaEvent(this));
        } else if (temperatura <= avisoFrio) {
            //Esablecemos el texto en color azul
            this.setForeground(Color.BLUE);
            listener.avisoFrio(new TemperaturaEvent(this));
        } else {
            //Establecemos texto color negro
            this.setForeground(Color.BLACK);
        }

        //Establecemos lo que ha de mostrar el JLablel
        mostrartermometro();

    }

    private void mostrartermometro() {
        if (isCelsius()) {
            setText(String.valueOf(df.format(temperatura)) + " ºC");

        } else if (isCelsius() && temperatura <= avisoFrio) {
            setText(String.valueOf("-"+df.format(temperatura)) + " ºC");

        } else {
            setText(String.valueOf(df.format(temperatura)) + " F");

        }

    }

    public class TemperaturaEvent extends EventObject {

        public TemperaturaEvent(Object source) {
            super(source);
        }
    }

    public interface TemperaturaListener extends EventListener {

        void avisoCalor(TemperaturaEvent event);

        void avisoFrio(TemperaturaEvent event);
    }

    public void addTemperaturaListener(TemperaturaListener listener) {
        this.listener = listener;
    }

    public void removeTemperaturaListener(TemperaturaListener listener) {
        this.listener = null;
    }

}
