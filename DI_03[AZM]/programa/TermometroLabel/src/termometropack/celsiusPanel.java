/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termometropack;

/**
 *
 * @author ROZER
 */
public class celsiusPanel extends javax.swing.JPanel {

    /**
     * Creates new form celsiusPanel
     */
    public celsiusPanel() {
        initComponents();
    }

    public boolean getSelectedValue() {

            if(cmbEscala.getSelectedIndex() == 0)
                return true;
            else
                return false;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTemperatura = new javax.swing.JLabel();
        cmbEscala = new javax.swing.JComboBox<>();

        txtTemperatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTemperatura.setText("Escala de Temperatura: ");

        cmbEscala.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbEscala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius (ºC)", "Fahrenheit (ºF)" }));
        cmbEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtTemperatura)
                .addGap(26, 26, 26)
                .addComponent(cmbEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperatura)
                    .addComponent(cmbEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEscalaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cmbEscala;
    private javax.swing.JLabel txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
