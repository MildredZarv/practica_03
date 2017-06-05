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
public class PantallaAdministrador extends javax.swing.JFrame {

    private ControllerUsuario controllerUsuario;
    private ControllerLibros controllerLibros;
    private TablaMostrarLibros tablaMostrar;
    private TablaMostrarUsuario tablaUsuarios;
    private DialogAgregarUsuario agregarUs;
    private DialogAgregarLibro agregar;
    private IngresarISBN isbn;
    private Libros libro1;
    private IngresarMatricula ingMat;
    private PrestamosAdmi prest;
    private MatriculaRenovar mat;
    public PantallaAdministrador() {
        tablaMostrar=new TablaMostrarLibros();
        mat=new MatriculaRenovar();
        ingMat=new IngresarMatricula();
        tablaUsuarios=new TablaMostrarUsuario();
        isbn=new IngresarISBN();
        prest=new PrestamosAdmi();
        agregarUs=new DialogAgregarUsuario(this,true);
        agregar=new DialogAgregarLibro(this,true);
        initComponents();
    }
    
    public void setControllerUsuario(ControllerUsuario cu){
        controllerUsuario=cu;
    }
    public void setControllerLibros(ControllerLibros cl){
        controllerLibros=cl;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarLibro = new javax.swing.JButton();
        btnModificarLibro = new javax.swing.JButton();
        btnMostrarLibros = new javax.swing.JButton();
        btnAgregarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnRenovar = new javax.swing.JButton();
        MostrarUsuarios2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAgregarLibro.setText("Agregar libro");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        btnModificarLibro.setText("Modificar libro");
        btnModificarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLibroActionPerformed(evt);
            }
        });

        btnMostrarLibros.setText("Mostrar libros");
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setText("Agregar usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setText("Modificar usuario");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnRenovar.setText("Renovar libro");
        btnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarActionPerformed(evt);
            }
        });

        MostrarUsuarios2.setText("Mostrar usuarios");
        MostrarUsuarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUsuarios2ActionPerformed(evt);
            }
        });

        jButton1.setText("Prestar libro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRenovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MostrarUsuarios2))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRenovar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarLibros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MostrarUsuarios2)
                            .addComponent(jButton1))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        tablaMostrar.setControllerLibros(controllerLibros);
        tablaMostrar.setControllerUsuario(controllerUsuario);
        tablaMostrar.setVisible(true);
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

    private void btnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarActionPerformed
        mat.setContUsuario(controllerUsuario);
        mat.setVisible(true);
        
    }//GEN-LAST:event_btnRenovarActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        agregar.setControllerLibros(controllerLibros);
        agregar.setEditarLibro(new Libros());
        agregar.setVisible(true);
        try {
            controllerLibros.Guardar();
        } catch (IOException ex) {
            Logger.getLogger(PantallaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnModificarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLibroActionPerformed
        isbn.setControllerLibros(controllerLibros);
        isbn.setVisible(true);
        tablaMostrar.setControllerLibros(controllerLibros);
    }//GEN-LAST:event_btnModificarLibroActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        agregarUs.setContUsuario(controllerUsuario);
        agregarUs.setVisible(true);
        try {
            controllerUsuario.GuardarAlumnos();
        } catch (IOException ex) {
            Logger.getLogger(PantallaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void MostrarUsuarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUsuarios2ActionPerformed
        tablaUsuarios.setControllerLibros(controllerLibros);
        tablaUsuarios.setControllerUsuario(controllerUsuario);
        tablaUsuarios.setVisible(true);
    }//GEN-LAST:event_MostrarUsuarios2ActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
       ingMat.setControllerUsuario(controllerUsuario);
       ingMat.setVisible(true);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mat.setContUsuario(controllerUsuario);
        tablaUsuarios.setControllerUsuario(controllerUsuario);
        mat.setN(1);
        mat.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    

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
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostrarUsuarios2;
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnModificarLibro;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnRenovar;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
