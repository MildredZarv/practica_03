
package javaapplication20;

import java.awt.Color;



public class Colores extends javax.swing.JFrame {

    public Colores() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JPanel();
        SliderRojo = new javax.swing.JSlider();
        SliderVerde = new javax.swing.JSlider();
        SliderAzul = new javax.swing.JSlider();
        SpinnerRojo = new javax.swing.JSpinner();
        SpinnerVerde = new javax.swing.JSpinner();
        SpinnerAzul = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pantalla.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        SliderRojo.setMaximum(255);
        SliderRojo.setValue(0);
        SliderRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderRojoStateChanged(evt);
            }
        });

        SliderVerde.setMaximum(255);
        SliderVerde.setValue(0);
        SliderVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderVerdeStateChanged(evt);
            }
        });

        SliderAzul.setMaximum(255);
        SliderAzul.setValue(0);
        SliderAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderAzulStateChanged(evt);
            }
        });

        SpinnerRojo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        SpinnerRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerRojoStateChanged(evt);
            }
        });

        SpinnerVerde.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        SpinnerVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerVerdeStateChanged(evt);
            }
        });

        SpinnerAzul.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        SpinnerAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerAzulStateChanged(evt);
            }
        });

        jLabel1.setText("Rojo");

        jLabel2.setText("Verde");

        jLabel3.setText("Azul");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SliderVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SliderAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SliderRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SpinnerAzul)
                                    .addComponent(SpinnerRojo)
                                    .addComponent(SpinnerVerde))))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SliderRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(SpinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpinnerRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerRojoStateChanged
       
        SliderRojo.setValue((Integer)SpinnerRojo.getValue());
        Color color=new Color((Integer)SpinnerRojo.getValue(),(Integer)SpinnerVerde.getValue(),(Integer)SpinnerAzul.getValue());
        Pantalla.setBackground(color);
    }//GEN-LAST:event_SpinnerRojoStateChanged

    private void SpinnerVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerVerdeStateChanged
        SliderVerde.setValue((Integer)SpinnerVerde.getValue());
        Color color=new Color((Integer)SpinnerRojo.getValue(),(Integer)SpinnerVerde.getValue(),(Integer)SpinnerAzul.getValue());
        Pantalla.setBackground(color);
    }//GEN-LAST:event_SpinnerVerdeStateChanged

    private void SpinnerAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerAzulStateChanged
         SliderAzul.setValue((Integer)SpinnerAzul.getValue());
         Color color=new Color((Integer)SpinnerRojo.getValue(),(Integer)SpinnerVerde.getValue(),(Integer)SpinnerAzul.getValue());
        Pantalla.setBackground(color);
    }//GEN-LAST:event_SpinnerAzulStateChanged

    private void SliderRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderRojoStateChanged
         SpinnerRojo.setValue(SliderRojo.getValue());
    }//GEN-LAST:event_SliderRojoStateChanged

    private void SliderVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderVerdeStateChanged
          SpinnerVerde.setValue(SliderVerde.getValue());
    }//GEN-LAST:event_SliderVerdeStateChanged

    private void SliderAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderAzulStateChanged
        SpinnerAzul.setValue(SliderAzul.getValue());
    }//GEN-LAST:event_SliderAzulStateChanged

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
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pantalla;
    private javax.swing.JSlider SliderAzul;
    private javax.swing.JSlider SliderRojo;
    private javax.swing.JSlider SliderVerde;
    private javax.swing.JSpinner SpinnerAzul;
    private javax.swing.JSpinner SpinnerRojo;
    private javax.swing.JSpinner SpinnerVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
