package javaapplication20;
public class Persona1 extends javax.swing.JFrame {
private Persona persona;
    
    public Persona1() {
       initComponents();
       persona=new Persona("", "", "", 0, 0, 0);
       
       
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgruopSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbmes = new javax.swing.JComboBox();
        jcbdia = new javax.swing.JComboBox();
        jcbaño = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jrbSoltero = new javax.swing.JRadioButton();
        jrbCasado = new javax.swing.JRadioButton();
        jtfNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Fecha de nacimiento");

        jcbmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcbmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmesActionPerformed(evt);
            }
        });

        jcbdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
        jcbdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbdiaActionPerformed(evt);
            }
        });

        jcbaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        jcbaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbañoActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado Civil");

        jLabel4.setText("Sexo");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sexo", "Femenino", "Masculino" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        jButton1.setText("Generar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bgruopSexo.add(jrbSoltero);
        jrbSoltero.setText("Soltero(a)");
        jrbSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSolteroActionPerformed(evt);
            }
        });

        bgruopSexo.add(jrbCasado);
        jrbCasado.setText("Casado(a)");
        jrbCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCasadoActionPerformed(evt);
            }
        });

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbSoltero)
                        .addGap(18, 18, 18)
                        .addComponent(jrbCasado))
                    .addComponent(jtfNombre))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jrbSoltero)
                    .addComponent(jrbCasado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmesActionPerformed
        Integer n=Integer.parseInt(String.valueOf(jcbaño.getSelectedItem()));
        Integer mes=Integer.parseInt(String.valueOf(jcbmes.getSelectedIndex()));
        switch(jcbmes.getSelectedIndex()){
            
            case 2:
                if(n%4==0){
                    jcbdia.addItem("29");
                }
                break;
            case 4: case 6: case 9: case 11:
                jcbdia.addItem("29");
                jcbdia.addItem("30");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jcbdia.addItem("29");
                jcbdia.addItem("30");
                jcbdia.addItem("31");
                break;
            
            }
        
    }//GEN-LAST:event_jcbmesActionPerformed

    private void jcbañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbañoActionPerformed
   
    }//GEN-LAST:event_jcbañoActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
                persona.setsexo((String)jcbSexo.getSelectedItem());
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jcbdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbdiaActionPerformed
        
    }//GEN-LAST:event_jcbdiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        persona.setNombre(jtfNombre.getText());
//        persona.setsexo(String.valueOf(jcbSexo.getSelectedItem()));
        persona.setaño(Integer.parseInt(String.valueOf(jcbaño.getSelectedItem())));
        persona.setmes(Integer.parseInt(String.valueOf(jcbmes.getSelectedIndex())));
        persona.setdia(Integer.parseInt(String.valueOf(jcbdia.getSelectedItem())));
        persona.setfechaNacimiento();
        persona.ImprimirInf();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jrbSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSolteroActionPerformed
        if(jcbSexo.getSelectedItem().equals("Femenino")){
            persona.setestadoCivil("Soltera");
        }else{
            persona.setestadoCivil("Soltero");
        }
        
    }//GEN-LAST:event_jrbSolteroActionPerformed

    private void jrbCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCasadoActionPerformed
         if(jcbSexo.getSelectedItem().equals("Femenino")){
            persona.setestadoCivil("Casada");
        }else{
            persona.setestadoCivil("Casado");
        } 
//        persona.setestadoCivil(String.valueOf(jrbCasado.getLabel()));
    }//GEN-LAST:event_jrbCasadoActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        
    }//GEN-LAST:event_jtfNombreActionPerformed

    
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
            java.util.logging.Logger.getLogger(Persona1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgruopSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox jcbSexo;
    private javax.swing.JComboBox jcbaño;
    private javax.swing.JComboBox jcbdia;
    private javax.swing.JComboBox jcbmes;
    private javax.swing.JRadioButton jrbCasado;
    private javax.swing.JRadioButton jrbSoltero;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
