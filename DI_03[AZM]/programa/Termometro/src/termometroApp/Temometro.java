package termometroApp;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Temometro extends javax.swing.JFrame {

    /**
     * Creates new form Temometro
     */
    public Temometro() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("TERMOMETRO");

        rbCelsius.setSelected(true);
        termometro1.setCelsius(true);

        this.setIconImage(getIconImage());
//        JOptionPane.showConfirmDialog(rootPane,"Aviso altas temperaturas.", "Ola de calor", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showConfirmDialog(rootPane,"Aviso bajas temperaturas.", "Peligro de formación de hielo", JOptionPane.WARNING_MESSAGE);

    }

    /**
     * Agregamos nuestra imagen de logo del programa
     *
     * @return
     */
    @Override
    public Image getIconImage() {
        Image image = Toolkit.getDefaultToolkit().getImage(ClassLoader
                .getSystemResource("resource/termometro.png"));
        return image;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_escalaTemperaturas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbCelsius = new javax.swing.JRadioButton();
        rbFahren = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        termometro1 = new termometropack.Termometro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("VALOR DE LA TEMPERATURA");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bg_escalaTemperaturas.add(rbCelsius);
        rbCelsius.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbCelsius.setText("Celsius");
        rbCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelsiusActionPerformed(evt);
            }
        });

        bg_escalaTemperaturas.add(rbFahren);
        rbFahren.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbFahren.setText("Fahrenheit");
        rbFahren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbFahren, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rbCelsius)
                .addGap(18, 18, 18)
                .addComponent(rbFahren)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("ESCALA DE TEMPERATURAS");

        termometro1.addTemperaturaListener(new termometropack.Termometro.TemperaturaListener() {
            public void avisoCalor(termometropack.Termometro.TemperaturaEvent evt) {
                termometro1AvisoCalor(evt);
            }
            public void avisoFrio(termometropack.Termometro.TemperaturaEvent evt) {
                termometro1AvisoFrio(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(termometro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(termometro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelsiusActionPerformed
        // TODO add your handling code here:
        if (rbCelsius.isSelected()) {
            termometro1.setCelsius(true);
        }
    }//GEN-LAST:event_rbCelsiusActionPerformed

    private void rbFahrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenActionPerformed
        // TODO add your handling code here:
        if (rbFahren.isSelected()) {
            termometro1.setCelsius(false);
        }

    }//GEN-LAST:event_rbFahrenActionPerformed

    /**
     * Salta el mensaje cada vez que la temperatura es inferior a 0 o superior a 40 y no hay manera 
     * de conseguir que sólo se dispare una vez, te lo comente en un email hace más de una semana 
     * pero al no recibir contestación procedo a entregar tarea y seguir con las que me quedan.
     *  
     */
    
    private void termometro1AvisoCalor(termometropack.Termometro.TemperaturaEvent evt) {//GEN-FIRST:event_termometro1AvisoCalor
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(rootPane, "Aviso altas temperaturas.", "Ola de calor", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_termometro1AvisoCalor

    private void termometro1AvisoFrio(termometropack.Termometro.TemperaturaEvent evt) {//GEN-FIRST:event_termometro1AvisoFrio
        // TODO add your handling code here:
        
        JOptionPane.showConfirmDialog(rootPane, "Aviso bajas temperaturas.", "Peligro de formación de hielo", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_termometro1AvisoFrio

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Temometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Temometro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_escalaTemperaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbCelsius;
    private javax.swing.JRadioButton rbFahren;
    private termometropack.Termometro termometro1;
    // End of variables declaration//GEN-END:variables
}
