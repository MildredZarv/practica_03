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
public class ResponderExamen extends javax.swing.JFrame {

    /**
     * Creates new form ResponderExamen
     */
    private PreguntasA pgt;
    private Integer contador;
    private Integer n;
    Integer aux;
    public ResponderExamen() {
        initComponents();
        pgt=new PreguntasA();
        contador=0;
        n=8;
        Cuenta.setText(" 1/8");
     }
    public void setpgt(PreguntasA a){
       pgt=a;
       Pregunta.setText(pgt.getPregunta(contador));
        resp1.setText(pgt.getRespuesta(contador, 0));
        resp2.setText(pgt.getRespuesta(contador, 1));
        resp3.setText(pgt.getRespuesta(contador, 2));
        resp4.setText(pgt.getRespuesta(contador, 3));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seleccionar = new javax.swing.ButtonGroup();
        Pregunta = new javax.swing.JTextField();
        Cuenta = new javax.swing.JTextField();
        resp1 = new javax.swing.JTextField();
        resp2 = new javax.swing.JTextField();
        resp3 = new javax.swing.JTextField();
        resp4 = new javax.swing.JTextField();
        Opcion1 = new javax.swing.JRadioButton();
        Opcion2 = new javax.swing.JRadioButton();
        Opcion3 = new javax.swing.JRadioButton();
        Opcion4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Siguiente = new javax.swing.JButton();
        Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESPONDER EXAMEN");

        Pregunta.setEditable(false);
        Pregunta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        Cuenta.setEditable(false);

        resp1.setEditable(false);
        resp1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        resp2.setEditable(false);
        resp2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        resp3.setEditable(false);
        resp3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        resp4.setEditable(false);
        resp4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        Seleccionar.add(Opcion1);
        Opcion1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        Seleccionar.add(Opcion2);
        Opcion2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        Seleccionar.add(Opcion3);
        Opcion3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        Seleccionar.add(Opcion4);
        Opcion4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N

        jLabel1.setText("Seleccione una respuesta.");

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pregunta)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Opcion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resp3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Opcion1)
                                    .addComponent(Opcion2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(resp1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(resp2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Opcion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resp4))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(Atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Siguiente)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opcion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Opcion3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(7, 7, 7)
                                .addComponent(resp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Opcion4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(Opcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Siguiente)
                    .addComponent(Atras))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        
        if(Seleccionar.isSelected(null)){
           JOptionPane.showMessageDialog(this, "Seleccione una respuesta.", "Mensaje", 1,null );
        }else if(contador < n-1){
             contador++;
             Cuenta.setText(" "+(contador+1)+"/"+pgt.getPregExamen());
             pgt.setBoton1(contador-1, botonSelected());
             Pregunta.setText(pgt.getPregunta(contador));
             resp1.setText(pgt.getRespuesta(contador, 0));
             resp2.setText(pgt.getRespuesta(contador, 1));
             resp3.setText(pgt.getRespuesta(contador, 2));
             resp4.setText(pgt.getRespuesta(contador, 3));
             if(pgt.getBoton1(contador)!=5){
                 Integer op=pgt.getBoton1(contador);
                 if(op==1){
                     Opcion1.setSelected(true);
                 }else if(op==2){
                     Opcion2.setSelected(true);
                 }else if(op==3){
                     Opcion3.setSelected(true);
                 }else if(op==4){
                     Opcion4.setSelected(true);
                 }
             }else{
                  Integer a=botonSelected();
                  pgt.setBoton1(contador-1, a);
                  Seleccionar.clearSelection();
             }
             
        }else{
             Cuenta.setText(" "+n+"/"+pgt.getPregExamen());
             pgt.setBoton1(n-2, botonSelected());
             Pregunta.setText(pgt.getPregunta(contador));
             resp1.setText(pgt.getRespuesta(contador, 0));
             resp2.setText(pgt.getRespuesta(contador, 1));
             resp3.setText(pgt.getRespuesta(contador, 2));
             resp4.setText(pgt.getRespuesta(contador, 3));
             if(pgt.getBoton1(n-1)!=5){
                 Integer op=pgt.getBoton1(contador);
                 if(op==1){
                     Opcion1.setSelected(true);
                 }else if(op==2){
                     Opcion2.setSelected(true);
                 }else if(op==3){
                     Opcion3.setSelected(true);
                 }else if(op==4){
                     Opcion4.setSelected(true);
                 }
                 
             }else{
                  Integer a=botonSelected();
                  pgt.setBoton1(contador, a);
             }
             Finalizar fin=new Finalizar();
             fin.setPreguntasAlumno(pgt);
             fin.setVisible(true);
             
        }
    }//GEN-LAST:event_SiguienteActionPerformed
    
    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        if(contador>0){
            contador--;
        }
        if(contador==0 && Seleccionar.isSelected(null)){
        Cuenta.setText(" "+(contador+1)+"/"+pgt.getPregExamen());
        Pregunta.setText(pgt.getPregunta(contador));
             resp1.setText(pgt.getRespuesta(contador, 0));
             resp2.setText(pgt.getRespuesta(contador, 1));
             resp3.setText(pgt.getRespuesta(contador, 2));
             resp4.setText(pgt.getRespuesta(contador, 3));
        
        }else{
            Cuenta.setText(" "+(contador+1)+"/"+pgt.getPregExamen());
             Pregunta.setText(pgt.getPregunta(contador));
             resp1.setText(pgt.getRespuesta(contador, 0));
             resp2.setText(pgt.getRespuesta(contador, 1));
             resp3.setText(pgt.getRespuesta(contador, 2));
             resp4.setText(pgt.getRespuesta(contador, 3));
             
             Integer op=pgt.getBoton1(contador);
             if(op==1){
                 Opcion1.setSelected(true);
             }else if(op==2){
                 Opcion2.setSelected(true);
             }else if(op==3){
                 Opcion3.setSelected(true);
             }else if(op==4){
                 Opcion4.setSelected(true);
             }

        }
        if(contador>0){
            Cuenta.setText(" "+(contador + 1)+"/8");
            Pregunta.setText(pgt.getPregunta(contador));
             resp1.setText(pgt.getRespuesta(contador, 0));
             resp2.setText(pgt.getRespuesta(contador, 1));
             resp3.setText(pgt.getRespuesta(contador, 2));
             resp4.setText(pgt.getRespuesta(contador, 3));
             Integer op=pgt.getBoton1(contador);
             if(op==1){
                 Opcion1.setSelected(true);
             }else if(op==2){
                 Opcion2.setSelected(true);
             }else if(op==3){
                 Opcion3.setSelected(true);
             }else if(op==4){
                 Opcion4.setSelected(true);
             }
        
        }
    }//GEN-LAST:event_AtrasActionPerformed
     public Integer botonSelected(){
        if(Opcion1.isSelected()){
            return 1;
        }else if(Opcion2.isSelected()){
            return 2;
        }else if(Opcion3.isSelected()){
            return 3;
        }else if(Opcion4.isSelected()){
            return 4;
        }else if(Seleccionar.isSelected(null)){
            return 5;
        }else{
            return 6;
        }
     }
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
            java.util.logging.Logger.getLogger(ResponderExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResponderExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResponderExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResponderExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResponderExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Cuenta;
    private javax.swing.JRadioButton Opcion1;
    private javax.swing.JRadioButton Opcion2;
    private javax.swing.JRadioButton Opcion3;
    private javax.swing.JRadioButton Opcion4;
    private javax.swing.JTextField Pregunta;
    private javax.swing.ButtonGroup Seleccionar;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resp1;
    private javax.swing.JTextField resp2;
    private javax.swing.JTextField resp3;
    private javax.swing.JTextField resp4;
    // End of variables declaration//GEN-END:variables
}
