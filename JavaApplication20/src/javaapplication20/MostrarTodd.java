/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author MildReed Zaarv'
 */
public class MostrarTodd extends javax.swing.JFrame {
    private PreguntasM pm; 
    private PreguntasA pa;
    public MostrarTodd() {
        initComponents();
       pm=new PreguntasM();
       pa=new PreguntasA();
    }
    public void MostrarAlumno(){
        Pantalla.setText("Alumno: "+pa.getNombre());
        Pantalla.setText(Pantalla.getText()+"\nLicenciatura: "+pa.getCarrera());
        Pantalla.setText(Pantalla.getText()+"\nMatrícula: "+pa.getMatricula());
        Pantalla.setText(Pantalla.getText()+"\nSemestre: "+pa.getSemestre());
        Pantalla.setText(Pantalla.getText()+"\nAsinatura: "+pa.getMateria());
        Pantalla.setText(Pantalla.getText()+"\nTipo de examen: "+pa.getTipoExamen());
        Pantalla.setText(Pantalla.getText()+"\nPREGUNTAS: ");
        for (int i = 0; i < pa.getPregExamen(); i++) {
            Pantalla.setText(Pantalla.getText()+"\n"+pa.mostrarContestar(i));
        }
        Pantalla.setText(Pantalla.getText()+"\nRESULTADO: "+pa.getAciertos()+"/"+pa.getPregExamen());
        Double cal= (double)(pa.getAciertos()*10)/pa.getPregExamen();
         Pantalla.setText(Pantalla.getText()+"\nCALIFICACIÓN: "+cal);
        
    }
    public void setAlumno(PreguntasA preg){
        pa=preg;
        MostrarAlumno();
    }
    public void Mostrar(PreguntasM pg){
        pm=pg;
        for (int i = 0; i < pm.getTotalPreguntas(); i++) {
            if(pm.getPregunta(i)!=null){
            Pantalla.setText(Pantalla.getText()+"\n"+(i+1)+". "+pm.getPregunta(i));
            }else{
                i=pm.getTotalPreguntas();
            }
        }
    }
    public void setpm(PreguntasM pg){
       pm=pg;
        Pantalla.setText("LICENCIATURA: "+pm.getCarrera());
        Pantalla.setText(Pantalla.getText()+"\nSEMESTRE: "+pm.getSemestre());
        Pantalla.setText(Pantalla.getText()+"\nASIGNATURA: "+pm.getMateria());
        Pantalla.setText(Pantalla.getText()+"\nTIPO DE EXAMEN: "+pm.getTipoExamen());
        Pantalla.setText(Pantalla.getText()+"\nTOTAL DE PREGUNTAS: "+pm.getTotalPreguntas());
        for (int i = 0; i < pm.getTotalPreguntas(); i++) {
            Pantalla.setText(Pantalla.getText()+"\n"+(i+1)+". "+pm.getPregunta(i));
        }
        Pantalla.setText(Pantalla.getText()+"\nPREGUNTAS A RESPONDER: "+pm.getPregExamen());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Pantalla = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Pantalla.setEditable(false);
        Pantalla.setBackground(new java.awt.Color(243, 234, 255));
        Pantalla.setColumns(20);
        Pantalla.setForeground(new java.awt.Color(0, 102, 102));
        Pantalla.setRows(5);
        jScrollPane1.setViewportView(Pantalla);

        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Aceptar");
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
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
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
            java.util.logging.Logger.getLogger(MostrarTodd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarTodd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarTodd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarTodd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarTodd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Pantalla;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
