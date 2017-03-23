/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import javax.swing.JOptionPane;

/**
 *
 * @author MildReed Zaarv'
 */
public class ConvertidorTemperatura extends javax.swing.JFrame {

    /**
     * Creates new form ConvertidorTemperatura
     */
    public ConvertidorTemperatura() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        convCelsius = new javax.swing.JTextField();
        convFahrenheit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Celsius:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Fahrenheit:");

        convCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convCelsiusActionPerformed(evt);
            }
        });
        convCelsius.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                convCelsiusKeyReleased(evt);
            }
        });

        convFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convFahrenheitActionPerformed(evt);
            }
        });
        convFahrenheit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                convFahrenheitPropertyChange(evt);
            }
        });
        convFahrenheit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                convFahrenheitKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(convCelsius))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(convCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void convCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convCelsiusActionPerformed
        
    }//GEN-LAST:event_convCelsiusActionPerformed

    private void convFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convFahrenheitActionPerformed
       
    }//GEN-LAST:event_convFahrenheitActionPerformed

    private void convCelsiusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_convCelsiusKeyReleased
         if(!convCelsius.getText().equals("")){
            try{
            Double n=Double.parseDouble(convCelsius.getText());
            Double n1=(n*(1.8)) + 32;
            convFahrenheit.setText(String.valueOf(n1));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Introduzca un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_convCelsiusKeyReleased

    private void convFahrenheitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_convFahrenheitKeyReleased
        if(!convFahrenheit.getText().equals("")){
            try{
                Double n=Double.parseDouble(convFahrenheit.getText());
                Double n1=(n - 32)/1.8;
            convCelsius.setText(String.valueOf(n1));
            } catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Introduzca un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_convFahrenheitKeyReleased

    private void convFahrenheitPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_convFahrenheitPropertyChange

    }//GEN-LAST:event_convFahrenheitPropertyChange

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidorTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField convCelsius;
    private javax.swing.JTextField convFahrenheit;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
