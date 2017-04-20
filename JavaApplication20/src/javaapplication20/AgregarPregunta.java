
package javaapplication20;

import javax.swing.JOptionPane;

public class AgregarPregunta extends javax.swing.JFrame {
    private CrearExamen ce;
    private Integer contador;
    private Integer n;
    private PreguntasM pg=new PreguntasM();
    private  Integer aux;
    public AgregarPregunta() {
        initComponents();
        ce=new CrearExamen();
        contador=0;
    }
    public void setSemestre(Integer a){
        pg.setSemestre(a);
    }
    public void setMateria(String str){
        pg.setMateria(str);
    }
    public void settipoExamen(String str){
        pg.setTipoExamen(str);
    }
    public void setCarrera(String str){
        pg.setCarrera(str);
    }
    public void settotalPreguntas(Integer i){
     pg.setTotalPreguntas(i);
    }
    public void setPregExamen(Integer a){
        pg.setPregExamen(a);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupRespuesta = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Pregunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Respuesta2 = new javax.swing.JTextField();
        Respuesta3 = new javax.swing.JTextField();
        Respuesta1 = new javax.swing.JTextField();
        Respuesta4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        Opcion2 = new javax.swing.JRadioButton();
        Opción3 = new javax.swing.JRadioButton();
        Opcion4 = new javax.swing.JRadioButton();
        Siguiente = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cuenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR PREGUNTA");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel1.setText("Escriba su pregunta:");

        Pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreguntaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Posibles respuestas: marque únicamente la respuesta correcta. ");

        Respuesta2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        Respuesta2.setText("[Respuesta2]");

        Respuesta3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        Respuesta3.setText("[Respuesta3]");
        Respuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta3ActionPerformed(evt);
            }
        });

        Respuesta1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        Respuesta1.setText("[Respuesta1]");

        Respuesta4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        Respuesta4.setText("[Respuesta4]");
        Respuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Respuesta4ActionPerformed(evt);
            }
        });

        GroupRespuesta.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        GroupRespuesta.add(Opcion2);
        Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ActionPerformed(evt);
            }
        });

        GroupRespuesta.add(Opción3);
        Opción3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opción3ActionPerformed(evt);
            }
        });

        GroupRespuesta.add(Opcion4);
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
            }
        });

        Siguiente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(0, 102, 102));
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Atras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Atras.setForeground(new java.awt.Color(0, 102, 102));
        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Mostrar preguntas agregadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cuenta.setEditable(false);
        cuenta.setBackground(new java.awt.Color(194, 224, 253));
        cuenta.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cuenta.setForeground(new java.awt.Color(0, 102, 102));
        cuenta.setBorder(null);
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1)
                                        .addComponent(Opcion4)
                                        .addComponent(Opcion2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(Opción3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Respuesta2)
                                    .addComponent(Respuesta3)
                                    .addComponent(Respuesta4)
                                    .addComponent(Respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pregunta)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Siguiente)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Respuesta1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Opción3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Respuesta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Opcion4)
                    .addComponent(Respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Atras)
                    .addComponent(Siguiente))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setn(Integer a){
        n=a;
        cuenta.setText(" 1/"+n);
    }
    private void PreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreguntaActionPerformed
        
    }//GEN-LAST:event_PreguntaActionPerformed

    private void Respuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Respuesta3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      aux=1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
       
        if(Pregunta.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Escriba una pregunta.", "Mensaje", 1,null );
        }else if(GroupRespuesta.isSelected(null)){
           JOptionPane.showMessageDialog(this, "Seleccione una respuesta.", "Mensaje", 1,null );
        }else if(Respuesta1.getText().equals("[Respuesta1]")|| Respuesta2.getText().equals("[Respuesta2]") || Respuesta3.getText().equals("[Respuesta3]") || Respuesta4.getText().equals("[Respuesta4]")){
           JOptionPane.showMessageDialog(this, "Escriba todas las respuestas.", "Mensaje", 1,null );
       }else{
            if(contador < n-1){
            contador++;
            if(pg.getPregunta(contador)!=null){
                cuenta.setText((" "+(contador + 1)+"/"+n));
                pg.setPreguntas(Pregunta.getText(), contador-1);
                Pregunta.setText(pg.getPregunta(contador));
                Respuesta1.setText(pg.mostrarUna(contador, 0));
                Respuesta2.setText(pg.mostrarUna(contador, 1));
                Respuesta3.setText(pg.mostrarUna(contador, 2));
                Respuesta4.setText(pg.mostrarUna(contador, 3));
                aux=pg.getbtn(contador);
//                pg.setRespuestas(contador, 0, String.valueOf(Respuesta1.getText()),aux);
//                pg.setRespuestas(contador, 1, String.valueOf(Respuesta2.getText()),aux);
//                pg.setRespuestas(contador, 2, String.valueOf(Respuesta3.getText()),aux);
//                pg.setRespuestas(contador, 3, String.valueOf(Respuesta4.getText()),aux);
                Integer btn=pg.getbtn(contador);
                    switch (btn){ 
                            case 1: jRadioButton1.setSelected(true);
                                break;
                            case 2: Opcion2.setSelected(true);
                                break;
                            case 3: Opción3.setSelected(true);
                                break;
                            case 4: Opcion4.setSelected(true);
                                break;
                  }
            }else{
                
                cuenta.setText((" "+(contador + 1)+"/"+n));
                pg.setPreguntas(Pregunta.getText(), contador-1);
                pg.setRespuestas(contador-1, 0, String.valueOf(Respuesta1.getText()),aux);
                pg.setRespuestas(contador-1, 1, String.valueOf(Respuesta2.getText()),aux);
                pg.setRespuestas(contador-1, 2, String.valueOf(Respuesta3.getText()),aux);
                pg.setRespuestas(contador-1, 3, String.valueOf(Respuesta4.getText()),aux);
                Pregunta.setText("");
                Respuesta1.setText("[Respuesta1]");
                Respuesta2.setText("[Respuesta2]");
                Respuesta3.setText("[Respuesta3]");
                Respuesta4.setText("[Respuesta4]");
                GroupRespuesta.clearSelection();
            }
            
        }else{
            pg.setPreguntas(Pregunta.getText(), (n-1));
             pg.setRespuestas(n-1, 0, String.valueOf(Respuesta1.getText()),aux);
             pg.setRespuestas(n-1, 1, String.valueOf(Respuesta2.getText()),aux);
             pg.setRespuestas(n-1, 2, String.valueOf(Respuesta3.getText()),aux);
             pg.setRespuestas(n-1, 3, String.valueOf(Respuesta4.getText()),aux);
            cuenta.setText(String.valueOf(" "+(n)+"/"+n));
            Finalizar finalizar=new Finalizar();
            finalizar.setpr(pg);
            finalizar.setVisible(true);
        }
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        if(contador>0){
            contador--;
//       
        if(contador>-1){
        cuenta.setText((" "+(contador+1)+"/"+n));
        Pregunta.setText(pg.getPregunta(contador));
        pg.setPreguntas(Pregunta.getText(), contador);
        Respuesta1.setText(pg.mostrarUna(contador, 0));
        Respuesta2.setText(pg.mostrarUna(contador, 1));
        Respuesta3.setText(pg.mostrarUna(contador, 2));
        Respuesta4.setText(pg.mostrarUna(contador, 3));
        Integer btn=pg.getbtn(contador);
                if(btn==1){
                    jRadioButton1.setSelected(true);
                }else if(btn==2){
                    Opcion2.setSelected(true);
                }else if(btn==3){
                    Opción3.setSelected(true);
                }else{
                    Opcion4.setSelected(true);
                }
        }
        }
    }//GEN-LAST:event_AtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MostrarTodd mt=new MostrarTodd();
        mt.Mostrar(pg);
        mt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Respuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Respuesta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Respuesta4ActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuentaActionPerformed

    private void Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ActionPerformed
       aux=2;
    }//GEN-LAST:event_Opcion2ActionPerformed

    private void Opción3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opción3ActionPerformed
        aux=3;
    }//GEN-LAST:event_Opción3ActionPerformed

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
        aux=4;
    }//GEN-LAST:event_Opcion4ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPregunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.ButtonGroup GroupRespuesta;
    private javax.swing.JRadioButton Opcion2;
    private javax.swing.JRadioButton Opcion4;
    private javax.swing.JRadioButton Opción3;
    private javax.swing.JTextField Pregunta;
    private javax.swing.JTextField Respuesta1;
    private javax.swing.JTextField Respuesta2;
    private javax.swing.JTextField Respuesta3;
    private javax.swing.JTextField Respuesta4;
    private javax.swing.JButton Siguiente;
    private javax.swing.JTextField cuenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
