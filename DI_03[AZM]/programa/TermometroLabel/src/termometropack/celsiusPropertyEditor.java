/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termometropack;

import java.awt.Component;
import java.beans.*;

/**
 *
 * @author ROZER
 */
public class celsiusPropertyEditor extends PropertyEditorSupport {

    private celsiusPanel panel = null;

    public celsiusPropertyEditor() {
       //Inicializamos el panel
        panel = new celsiusPanel();
    }

    /**
     * Indica si se está utilizando o no un editor personalizado para la
     * propiedad. Como sí se está utilizando, devolvería true.
     *
     * @return
     */
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    /**
     * El código de este método sería devolver el objeto de nombre panel que
     * hemos declarado como propiedad de la clase.
     *
     * @return
     */
    @Override
    public Component getCustomEditor() {
        return panel;
    }
    
    /**
     * Este método devolvería el resultado de la llamada al método getSelectedValue 
     * del objeto panel que hemos declarado como propiedad de la clase. Recordemos 
     * que ese método getSelectedValue lo implementamos anteriormente para devolver 
     * el valor seleccionado por el usuario en el panel de la propiedad personalizada 
     * (true o false según el usuario haya elegido en el panel "Celsius" o "Fahrenheit").
     * @return 
     */

    @Override
    public Object getValue() {
        return panel.getSelectedValue();

    }

    /**
     * Devolvería la cadena “true” o “false” resultante de llamar al método 
     * getSelectedValue de la clase Panel.
     * @return 
     */
    @Override
    public String getJavaInitializationString() {
        return String.valueOf(panel.getSelectedValue());
    }

}
