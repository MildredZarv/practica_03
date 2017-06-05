/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MildReed Zaarv'
 */
public class DialogAgregarUsuario extends javax.swing.JDialog {

    private ControllerUsuario contUsuario;
    private ControllerLibros contLibros;
    private UsuarioAlumno uAlumno;
    public DialogAgregarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         uAlumno=new UsuarioAlumno();
        initComponents();
    }
   
    public void setContUsuario(ControllerUsuario cu){
        contUsuario=cu;
    }
    
     public  String convertToMD5(final String md5) throws UnsupportedEncodingException{
        StringBuffer sb=null;
        try{
            final java.security.MessageDigest md= java.security.MessageDigest.getInstance("MD5");
            final byte[] array=md.digest(md5.getBytes("UTF-8"));
            sb=new StringBuffer();
            for (int i = 0; i <array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }return sb.toString();
        }catch(final java.security.NoSuchAlgorithmException e){
            
        }return sb.toString();
    }
     
      public boolean ConfirmarContraseña(){
        if(txtContraseña.getText().equalsIgnoreCase(txtConfirmar.getText())){
            
            return true;
        }else{
            return false;
        }
    }
      
      public boolean UsuarioDisponible(){
        Object[] usuarios=contUsuario.ObtenerAlumnos();
        for (int i = 0; i < usuarios.length; i++) {
            UsuarioAlumno u1=(UsuarioAlumno)usuarios[i];
            if(u1.getUsuario().equalsIgnoreCase(txtUsuario.getText())){
                return false;
             }
        }
            return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmar = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        semestre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbCarrera = new javax.swing.JComboBox();
        txtMatricula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel2.setText("Matrícula");

        jLabel8.setText("Confirmar contraseña");

        jLabel3.setText("Teléfono");

        txtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuario");

        jLabel6.setText("Carrera");

        jLabel5.setText("Contraseña");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel7.setText("Semestre");

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ARQUITECTURA", "DERECHO", "FISIOTERAPIA", "INGENIERÍA CIVIL", "INGENIERÍA AMBIENTAL", "NEGOCIOS INTERNACIONALES", "LENGUAS", "INGENIERÍA EN ELECTRÓNICA" }));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAceptar))
                                .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(txtUsuario)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
           uAlumno.setNombre(txtNombre.getText());
           uAlumno.setMatricula(txtMatricula.getText());
           uAlumno.setCarrera(String.valueOf(cmbCarrera.getSelectedItem()));
           uAlumno.setSemestre(Integer.parseInt(semestre.getText()));
           uAlumno.setTelefono(txtTelefono.getText());
           if(UsuarioDisponible()){
               if(ConfirmarContraseña()){
                   uAlumno.setUsuario(txtUsuario.getText());
              try {
                  uAlumno.setContraseña(convertToMD5(txtContraseña.getText()));
              } catch (UnsupportedEncodingException ex) {
                  Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
              }
                   try {
                       contUsuario.AgregarUsuarioAlumno(uAlumno);
                   } catch (ObjetoExistente ex) {
                       Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   try {
                       contUsuario.GuardarAlumnos();
                   } catch (IOException ex) {
                       Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                   }
               txtContraseña.setText("");
               txtConfirmar.setText("");
               setVisible(false);
               }else{
               JOptionPane.showMessageDialog(this, "Las contraseñas deben coincidir", "Contraseña", 1,null ); 
               txtContraseña.setText("");
               txtConfirmar.setText("");
               setVisible(true);
               }
           }else{
               JOptionPane.showMessageDialog(this, "Nombre de usuario no disponible", "Usuario", 1,null );
               txtUsuario.setText("");
               txtContraseña.setText("");
               txtConfirmar.setText("");
//               setVisible(true);
           } 
           txtUsuario.setText("");
           txtContraseña.setText("");
           txtConfirmar.setText("");
           txtNombre.setName("");
           txtMatricula.setText("");
           txtTelefono.setText("");
           semestre.setText("");
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogAgregarUsuario dialog = new DialogAgregarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
//   if(uAlumno.getNombre()!=null){
//          if(ConfirmarContraseña()){
//              System.out.println("contraseñas iguales");
//               uAlumno.setNombre(txtNombre.getText());
//               uAlumno.setMatricula(txtMatricula.getText());
//               uAlumno.setCarrera(String.valueOf(cmbCarrera.getSelectedItem()));
//               uAlumno.setSemestre(Integer.parseInt(semestre.getText()));
//               uAlumno.setUsuario(txtUsuario.getText());
//              try {
//                  uAlumno.setContraseña(convertToMD5(txtContraseña.getText()));
//              } catch (UnsupportedEncodingException ex) {
//                  Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
//              }
//              try {
//                  contUsuario.GuardarAlumnos();
//              } catch (IOException ex) {
//                  Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
//              }
//               setVisible(false);
//           }else{
//               JOptionPane.showMessageDialog(this, "Las contraseñas deben coincidir", "Contraseña", 1,null ); 
//               txtContraseña.setText("");
//               txtConfirmar.setText("");
//               setVisible(true);
//           }
//       }else{
//           System.out.println("UsuarioNuevo");
//           uAlumno=new UsuarioAlumno();
//           uAlumno.setNombre(txtNombre.getText());
//           uAlumno.setMatricula(txtMatricula.getText());
//           uAlumno.setCarrera(String.valueOf(cmbCarrera.getSelectedItem()));
//           uAlumno.setSemestre(Integer.parseInt(semestre.getText()));
//           if(UsuarioDisponible()){
//               if(ConfirmarContraseña()){
//                   uAlumno.setUsuario(txtUsuario.getText());
//              try {
//                  uAlumno.setContraseña(convertToMD5(txtContraseña.getText()));
//              } catch (UnsupportedEncodingException ex) {
//                  Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
//              }
//                   try {
//                       contUsuario.AgregarUsuarioAlumno(uAlumno);
//                   } catch (ObjetoExistente ex) {
//                       Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
//                   }
//                   try {
//                       contUsuario.GuardarAlumnos();
//                   } catch (IOException ex) {
//                       Logger.getLogger(DialogAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
//                   }
//               txtContraseña.setText("");
//               txtConfirmar.setText("");
//               setVisible(false);
//               }else{
//               JOptionPane.showMessageDialog(this, "Las contraseñas deben coincidir", "Contraseña", 1,null ); 
//               txtContraseña.setText("");
//               txtConfirmar.setText("");
//               setVisible(true);
//               }
//           }else{
//               JOptionPane.showMessageDialog(this, "Nombre de usuario no disponible", "Usuario", 1,null );
//               txtUsuario.setText("");
//               txtContraseña.setText("");
//               txtConfirmar.setText("");
////               setVisible(true);
//           }
//       }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField semestre;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

