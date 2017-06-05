
package Biblioteca1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level; 
import java.util.logging.Logger;

/**
 *EDE9E8217C
 * @author MildReed Zaarv'
 */
public class TipoUsuario extends javax.swing.JFrame {
    private IngresarUsuario ingresarUsuario;
    private ControllerUsuario contUsuario;
    private ControllerLibros contLibros;
    private String tipoUsuario;
    private Libros l1;
    public TipoUsuario() throws UnsupportedEncodingException, IOException, ObjetoExistente {
        contUsuario=new ControllerUsuario();
        contLibros=new ControllerLibros();
        l1=new Libros();
        l1.setTitulo("El llano en llamas");
        l1.setDiaP(4);
        l1.setMesP(6);
        l1.setAnioP(2017);
        l1.setAnioE(2017);
        l1.setDiaE(7);
        l1.setMesE(6);
        l1.setRenovaciones(0);
        Libros l2=new Libros();
        l2.setTitulo("Los números primos");
        l2.setDiaP(2);
        l2.setMesP(6);
        l2.setAnioP(2017);
        l2.setAnioE(2017);
        l2.setDiaE(5);
        l2.setMesE(6);
        l2.setRenovaciones(0);
        Libros l3=new Libros();
        l3.setTitulo("Alzheimer");
        l3.setDiaP(3);
        l3.setMesP(6);
        l3.setAnioP(2017);
        l3.setAnioE(2017);
        l3.setDiaE(6);
        l3.setMesE(6);
        l3.setRenovaciones(0);
        Libros l4=new Libros();
        l4.setTitulo("Diccionario Etimológico");
        l4.setDiaP(3);
        l4.setMesP(6);
        l4.setAnioP(2017);
        l4.setAnioE(2017);
        l4.setDiaE(6);
        l4.setMesE(6);
        l4.setRenovaciones(0);
        Libros l5=new Libros();
        l5.setTitulo("Cálculo vectorial");
        l5.setDiaP(3);
        l5.setMesP(6);
        l5.setAnioP(2017);
        l5.setAnioE(2017);
        l5.setDiaE(6);
        l5.setMesE(6);
        l5.setRenovaciones(0);
        tipoUsuario="";
        ingresarUsuario=new IngresarUsuario();
        UsuarioAlumno u8=new UsuarioAlumno("Mildred","014407478","951146","mazv","0214","Ingeniería en Electrónica",2);
        UsuarioAlumno u2=new UsuarioAlumno("Luis","2016330341","1234","luiss","ssiul","Lic. en Derecho",6);
        UsuarioAlumno u1=new UsuarioAlumno("Carlos","2016003853","567890","carrl","lrrac","FISIOTERAPIA",2);
        UsuarioAlumno u9=new UsuarioAlumno("B","bbb","6789","b","b","LENGUAS",7);
        UsuarioAlumno u0=new UsuarioAlumno("A","aaa","12345","a","a","DERECHO",3);
        Usuario u3=new UsuarioAdministrador("Daniel","8878","95123456","dani34","34dani");
        Usuario u4=new UsuarioAdministrador("Alonso","8879","5538291","a713p","qwerty");
        u0.setLibrosPrestados(l1);
        u0.setLibrosPrestados(l2);
        u0.setLibrosPrestados(l3);
        u9.setLibrosPrestados(l4);
        u9.setLibrosPrestados(l1);
        u8.setLibrosPrestados(l5);
//        try{
//        contUsuario.AgregarUsuarioAlumno(u9);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//        contUsuario.AgregarUsuarioAlumno(u8);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//        contUsuario.AgregarUsuarioAlumno(u2);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//            contUsuario.AgregarUsuarioAlumno(u1);
//        }catch(ObjetoExistente ex){
//            
//        }
//        try {
//            contUsuario.AgregarUsuarioAlumno(u0);
//        } catch (ObjetoExistente ex) {
//            Logger.getLogger(TipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        Libros l1=new Libros("Crimen y castigo","Fiodor Dostoievsky","RT341SU8","Patria",5,4);
//        Libros l2=new Libros("Física Universitaria","Resnick","98y1SU8","Pearson",6,5);
//        Libros l3=new Libros("Ecuaciones diferenciales","Denis Zill","D2561qw","Pearson",5,4);
//        Libros l4=new Libros("Análisis de circuitos","Hayt","t65QRt07","McGrawHill",3,1);
//        Libros l5=new Libros("Álgebra lineal","Grossman ","Gr8uqy6Rt","Patria",8,4);
//        try{
//        contLibros.AgregarLibro(l1);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//        contLibros.AgregarLibro(l2);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//        contLibros.AgregarLibro(l3);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//        contLibros.AgregarLibro(l4);
//        }catch(ObjetoExistente ex){
//        } 
//        try{
//        contLibros.AgregarLibro(l5);
//        }catch(ObjetoExistente ex){
//        }
        try {
            contUsuario.Guardar();
        } catch (IOException ex) {
            Logger.getLogger(TipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        contUsuario.GuardarAlumnos(); 
        try {
            contLibros.Guardar();
        } catch (IOException ex) {
            Logger.getLogger(TipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        cmbUsuario = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario");

        jLabel1.setText("Usuario");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alumno", "Administrador" }));
        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(173, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(cmbUsuario.getSelectedItem().equals("Alumno")){
        tipoUsuario="Alumno";
        }else{
            tipoUsuario="Administrador";
        }
        ingresarUsuario.setControllerUsuario(contUsuario);
        ingresarUsuario.setControllerLibros(contLibros);
        ingresarUsuario.settipoUsuario(tipoUsuario);
        ingresarUsuario.setVisible(true);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(TipoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TipoUsuario().setVisible(true);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(TipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ObjetoExistente ex) {
                    Logger.getLogger(TipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox cmbUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
