/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import javafx.scene.control.Spinner;
import javax.swing.JSpinner;

public class CrearExamen extends javax.swing.JFrame {
    public String[]preg;
    public Integer totalP;
   
    public CrearExamen() {
        initComponents();
       preg=new String[20];
        totalP=10;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComboMaterias = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ComboTipoExamen = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        ComboCarrera = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        totalPreguntas = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        pregExamen = new javax.swing.JSpinner();
        Siguiente = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        semestre = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR EXAMEN");
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel1.setText("Materia");

        ComboMaterias.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        ComboMaterias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TALLER DE DIBUJO", "FILOSOF�A", "HISTORIA", "ESTRUCTURAS", "MATERIALES", "DISE�O" }));
        ComboMaterias.setSelectedItem(ComboCarrera);
        ComboMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMateriasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel2.setText("Tipo de examen");

        ComboTipoExamen.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        ComboTipoExamen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PARCIAL", "ORDINARIO", "EXTRAORDINADIO" }));
        ComboTipoExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoExamenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel3.setText("Carrera");

        ComboCarrera.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        ComboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ARQUITECTURA", "DERECHO", "FISIOTERAPIA", "GASTRONOM�A", "INGENIER�A AMBIENTAL", "INGENIER�A CIVIL", "INGENIER�A INDUSTRIAL", "INGENIER�A EN ELECTR�NICA", "NEGOCIOS" }));
        ComboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCarreraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel4.setText("Total de preguntas");

        totalPreguntas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        totalPreguntas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        totalPreguntas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                totalPreguntasStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel5.setText("Preguntas a responder");

        pregExamen.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        pregExamen.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        Siguiente.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel6.setText("Semestre");

        semestre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        semestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        semestre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                semestreStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Siguiente)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ComboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pregExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Siguiente)
                    .addComponent(Cancelar))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMateriasActionPerformed
     public void asignar(){
         Integer a=Integer.parseInt(String.valueOf(semestre.getValue()));
       if(a==1){
           String n=String.valueOf(ComboCarrera.getSelectedItem());
        switch (n){
            case "ARQUITECTURA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("TALLER DE DIBUJO I");
                ComboMaterias.addItem("FILOSOF�A");
                ComboMaterias.addItem("TEOR�A DE ARQUITECTURA I");
                ComboMaterias.addItem("ESTRUCTURAS");
                ComboMaterias.addItem("MATERIALES");
                ComboMaterias.addItem("DISE�O");
                break;
            case "DERECHO":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("DERECHO ROMANO I");
                ComboMaterias.addItem("TEOR�AS DE ESTADO");
                ComboMaterias.addItem("SISTEMAS JUR�DICOS");
                ComboMaterias.addItem("DERECHOS HUMANOS");
                ComboMaterias.addItem("FILOSOF�A");
                ComboMaterias.addItem("SOCIOLOG�A JUR�DICA");
                break;
            case "FISIOTERAPIA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("FISIOLOG�A DEL EJERCICIO");
                ComboMaterias.addItem("DISCAPACIDAD Y SOCIEDAD");
                ComboMaterias.addItem("KINESIOLOG�A");
                ComboMaterias.addItem("BIOMEC�NICA");
                ComboMaterias.addItem("FUNDAMENTOS DE EMBRIOLOG�A");
                ComboMaterias.addItem("ANATOMOFISIOLOG�A HUMANA");
                break;
            case "INGENIER�A CIVIL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("QU�MICA PARA LA INGENIER�A");
                ComboMaterias.addItem("PROGRAMACI�N");
                ComboMaterias.addItem("C�LCULO");
                ComboMaterias.addItem("�LGEBRA");
                ComboMaterias.addItem("F�SICA");
                break;
            case "INGENIER�A INDUSTRIAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("PROCESOS Y EXPRESI�N");
                ComboMaterias.addItem("�LGEBRA SUPERIOR");
                ComboMaterias.addItem("C�LCULO");
                ComboMaterias.addItem("F�SICA");
                ComboMaterias.addItem("QU�MICA");
                break;
            case "GASTRONOM�A":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ADMINISTRACI�N");
                ComboMaterias.addItem("NUTRICI�N Y PRODUCTOS");
                ComboMaterias.addItem("COMERCIALIZACI�N");
                ComboMaterias.addItem("RELACIONES P�BLICAS");
                break;
            case "INGENIER�A AMBIENTAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("QU�MICA ORG�NICA");
                ComboMaterias.addItem("C�LCULO");
                ComboMaterias.addItem("�LGEBRA LINEAL");
                ComboMaterias.addItem("BIOQU�MICA");
                ComboMaterias.addItem("F�SICA");
                ComboMaterias.addItem("ANTROPOLOG�A");
                break;
            case "INGENIER�A EN ELECTR�NICA":
                
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("�LGEBRA SUPERIOR");
                ComboMaterias.addItem("PROGRAMACI�N");
                ComboMaterias.addItem("LA PERSONA Y SU PROCESO F.");
                ComboMaterias.addItem("INTRODUCCI�N A LA INGENIER�A");
                ComboMaterias.addItem("COMUNICACI�N PROFESIONAL");
                ComboMaterias.addItem("METROLOG�A E INSTRUMENTACI�N");
                break;
            case "NEGOCIOS":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("CONTABILIDAD");
                ComboMaterias.addItem("ECONOM�A");
                ComboMaterias.addItem("TIC'S");
                ComboMaterias.addItem("ARTE, HISTORIA Y CULTURA");
                ComboMaterias.addItem("MATEM�TICAS");
                ComboMaterias.addItem("FILOSOF�A");
                break;
         }
           
       }else if(a==2){
        String n=String.valueOf(ComboCarrera.getSelectedItem());
        switch (n){
            case "ARQUITECTURA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("TEOR�A DE ARQUITECTURA II");
                ComboMaterias.addItem("TALLER DE DIBUJO II");
                ComboMaterias.addItem("MATEM�TICAS APLICADAS");
                ComboMaterias.addItem("SISTEMAS ESTRUCTURALES");
                ComboMaterias.addItem("ARQUITECTURA EN M�XICO.");
                break;
            case "DERECHO":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("DERECHO ROMANO II");
                ComboMaterias.addItem("TEOR�A DEL DERECHO");
                ComboMaterias.addItem("METODOLOG�A JUR�DICA");
                ComboMaterias.addItem("TEOR�A DE LA CONSTITUCI�N");
                ComboMaterias.addItem("ACTO JUR�DICO Y PERSONAS");
                ComboMaterias.addItem("SOCIOLOG�A JUR�DICA");
                break;
            case "FISIOTERAPIA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("BIOLOG�A MOLECULAR");
                ComboMaterias.addItem("BIOLOG�A CELULAR");
                ComboMaterias.addItem("FUNCI�N MUSCULAR");
                ComboMaterias.addItem("MEDICAMENTOS");
                ComboMaterias.addItem("APRENDIZAJE BASADO EN PROBLEMAS");
                break;
            case "INGENIER�A CIVIL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("PROGRAMACI�N");
                ComboMaterias.addItem("EST�TICA");
                ComboMaterias.addItem("C�LCULO VECTORIAL");
                ComboMaterias.addItem("�LGEBRA LINEAL");
                ComboMaterias.addItem("F�SICA II");
                break;
            case "INGENIER�A INDUSTRIAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("FILOSOF�A");
                ComboMaterias.addItem("ECONOM�A");
                ComboMaterias.addItem("C�LCULO");
                ComboMaterias.addItem("�LGEBRA");
                ComboMaterias.addItem("MERCADOTECNIA");
                break;
            case "GASTRONOM�A":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("SANIDAD AMBIENTAL");
                ComboMaterias.addItem("BIOQU�MICA");
                ComboMaterias.addItem("EPIDEMIOLOG�A");
                ComboMaterias.addItem("RELACIONES P�BLICAS");
                break;
            case "INGENIER�A AMBIENTAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("LABORATORIO");
                ComboMaterias.addItem("C�LCULO VECTORIAL");
                ComboMaterias.addItem("�LGEBRA LINEAL");
                ComboMaterias.addItem("TERMODIN�MICA");
                ComboMaterias.addItem("ECUACIONES DIFERENCIALES");
                ComboMaterias.addItem("F�SICA");
                ComboMaterias.addItem("ANTROPOLOG�A");
                break;
            case "INGENIER�A EN ELECTR�NICA":
                
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("�LGEBRA LINEAL");
                ComboMaterias.addItem("C�LCULO");
                ComboMaterias.addItem("AN�LISIS DE CIRCUITOS");
                ComboMaterias.addItem("CIRCUITOS L�GICOS");
                ComboMaterias.addItem("ANTROPOLOG�A");
                ComboMaterias.addItem("PROGRAMACI�N");
                break;
            case "NEGOCIOS":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ECONOMETR�A");
                ComboMaterias.addItem("SISTEMAS TRIBUTARIOS");
                ComboMaterias.addItem("ESTAD�STICA");
                ComboMaterias.addItem("MATEM�TICAS FINANCIERAS");
                ComboMaterias.addItem("ANTROPOLOG�A");
                break;
         }
       }else if(a==3){
           String n=String.valueOf(ComboCarrera.getSelectedItem());
        switch (n){
            case "ARQUITECTURA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ARQUITECTURA, AMBIENTE y CIUDAD");
                ComboMaterias.addItem("ARQUITECTURA MESOAMERICANA");
                ComboMaterias.addItem("TEOR�A DE LA ARQUITECTURA III");
                ComboMaterias.addItem("INSTALACIONES I");
                ComboMaterias.addItem("SISTEMAS ESTRUCTURALES III");
                ComboMaterias.addItem("EXTENSI�N UNIVERSITARIA");
                break;
            case "DERECHO":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("BIENES Y DERECHOS REALES");
                ComboMaterias.addItem("DELITOS EN PARTICULAS");
                ComboMaterias.addItem("DERECHO CONSTITUCIONAL");
                ComboMaterias.addItem("SISTEMAS JUR�DICOS");
                ComboMaterias.addItem("TEOR�A DEL PROCESO");
                ComboMaterias.addItem("TEOR�A ECON�MICA");
                break;
            case "FISIOTERAPIA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("FISIOLOG�A");
                ComboMaterias.addItem("BIOMEDICINA");
                ComboMaterias.addItem("COMPUTACI�N");
                ComboMaterias.addItem("HISTOLOGIA");
                ComboMaterias.addItem("FILOSOF�A");
                ComboMaterias.addItem("FARMACOLOG�A");
                break;
            case "INGENIER�A CIVIL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ELECTRICIDAD Y MAGNETISMO");
                ComboMaterias.addItem("TEOR�A DE CONTROL");
                ComboMaterias.addItem("DIN�MICA");
                ComboMaterias.addItem("MATEM�TICAS DISCRETAS");
                ComboMaterias.addItem("ECUACIONES DIFERENCIALES");
                break;
            case "INGENIER�A INDUSTRIAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ECUACIONES DIFERENCIALES");
                ComboMaterias.addItem("ECONOM�A II");
                ComboMaterias.addItem("C�LCULO VECTORIAL");
                ComboMaterias.addItem("ECONOMETR�A");
                ComboMaterias.addItem("AN�LISIS NUM�RICO");
                break;
            case "GASTRONOM�A":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("GASTRONOM�A MEXICANA");
                ComboMaterias.addItem("BIOQU�MICA METAB�LICA");
                ComboMaterias.addItem("NUTRICI�N HUMANA");
                ComboMaterias.addItem("RELACIONES P�BLICAS");
                break;
            case "INGENIER�A AMBIENTAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("LABORATORIO");
                ComboMaterias.addItem("C�LCULO");
                ComboMaterias.addItem("�LGEBRA LINEAL");
                ComboMaterias.addItem("BIOQU�MICA");
                ComboMaterias.addItem("TERMODIN�MICA");
                ComboMaterias.addItem("ECUACIONES DIFERENCIALES");
                ComboMaterias.addItem("F�SICA");
                ComboMaterias.addItem("ANTRO�LOG�A");
                break;
            case "INGENIER�A EN ELECTR�NICA":
                
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("C�LCULO VECTORIAL");
                ComboMaterias.addItem("ECUACIONES DIFERENCIALES");
                ComboMaterias.addItem("AN�LISIS DE CIRCUITOS II");
                ComboMaterias.addItem("DISE�O L�GICO");
                ComboMaterias.addItem("DISPOSITIVOS SEMICONDUCTORES");
                ComboMaterias.addItem("S�NTESIS DE CIRCUITOS L�GICOS");
                break;
            case "NEGOCIOS":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("CONTABILIDAD II");
                ComboMaterias.addItem("ECONOM�A II");
                ComboMaterias.addItem("ARTE, HISTORIA Y CULTURA");
                ComboMaterias.addItem("MATEM�TICAS");
                ComboMaterias.addItem("EL HOMBRE UN SER SOCIAL");
                break;
         }
       }else if(a==4){
           String n=String.valueOf(ComboCarrera.getSelectedItem());
       switch (n){
            case "ARQUITECTURA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("TALLER DE DIBUJO");
                ComboMaterias.addItem("FILOSOF�A");
                ComboMaterias.addItem("HISTORIA");
                ComboMaterias.addItem("ESTRUCTURAS");
                ComboMaterias.addItem("MATERIALES");
                ComboMaterias.addItem("DISE�O");
                break;
            case "DERECHO":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("DERECHO CIVIL");
                ComboMaterias.addItem("TEOR�AS DE ESTADO");
                ComboMaterias.addItem("SISTEMAS JUR�DICOS");
                ComboMaterias.addItem("DERECHOS HUMANOS");
                ComboMaterias.addItem("FiLOSOF�A");
                ComboMaterias.addItem("SOCIOLOG�A JUR�DICA");
                break;
            case "FISIOTERAPIA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ANATOM�A");
                ComboMaterias.addItem("FISIOLOG�A");
                ComboMaterias.addItem("BIOQU�MICA");
                ComboMaterias.addItem("BIOMEC�NICA");
                ComboMaterias.addItem("COMPUTACI�N");
                ComboMaterias.addItem("HISTOLOGIA");
                ComboMaterias.addItem("FILOSOF�A");
                ComboMaterias.addItem("FARMACOLOG�A");
                break;
            case "INGENIER�A CIVIL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("TERMODIN�MICA");
                ComboMaterias.addItem("PROBABILIDAD Y ESTADISTICA");
                ComboMaterias.addItem("RESISTENCIA DE MATERIALES");
                ComboMaterias.addItem("HIDR�ULICA");
                ComboMaterias.addItem("COMUNICACI�N PROFESIONAL");
                break;
            case "INGENIER�A INDUSTRIAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("ELECTRICIDAD INDUSTRIAL");
                ComboMaterias.addItem("ECUACIONES DIFERENCIALES");
                ComboMaterias.addItem("METROLOG�A");
                ComboMaterias.addItem("ESTUDIO DEL TRABAJO");
                ComboMaterias.addItem("M�TODOS ESTAD�STICOS");
                break;
            case "GASTRONOM�A":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("COCINA ITALIANA");
                ComboMaterias.addItem("COCINA FRANCESA");
                ComboMaterias.addItem("REPOSTER�A");
                ComboMaterias.addItem("VINICULTURA");
                break;
            case "INGENIER�A AMBIENTAL":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("SISTEMAS DE LA TIERRA");
                ComboMaterias.addItem("QU�MICA INORG�NICA");
                ComboMaterias.addItem("FLUJO DE FLUIDOS");
                ComboMaterias.addItem("QU�MICA ANAL�TICA");
                ComboMaterias.addItem("BALANCES DE MATERIA Y ENERG�A");
                break;
            case "INGENIER�A EN ELECTR�NICA":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("TEOR�A DE CONTROL");
                ComboMaterias.addItem("AN�LISIS DE SE�ALES");
                ComboMaterias.addItem("CIRCUITOS INTEGRADOS LINEALES");
                ComboMaterias.addItem("SISTEMAS MECATR�NICOS");
                ComboMaterias.addItem("DISE�O ASISTIDO POR COMPUTADORA");
                ComboMaterias.addItem("EL HOMBRE UN SER SOCIAL");
                break;
            case "NEGOCIOS":
                ComboMaterias.removeAllItems();
                ComboMaterias.addItem("GEOECONOM�A");
                ComboMaterias.addItem("LOG�STICA Y TRANSPORTE");
                ComboMaterias.addItem("MARCO JUR�DICO DE LA EMPRESA");
                ComboMaterias.addItem("M�TODOS ESTAD�SCICOS");
                break;
         }
       }
     }
    private void ComboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCarreraActionPerformed
      asignar();
    }//GEN-LAST:event_ComboCarreraActionPerformed

    private void ComboTipoExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoExamenActionPerformed
        
    }//GEN-LAST:event_ComboTipoExamenActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
       setVisible(false);
       AgregarPregunta ap=new AgregarPregunta();
       ap.setn(Integer.parseInt(String.valueOf(totalPreguntas.getValue())));
       ap.setCarrera(String.valueOf(String.valueOf(ComboCarrera.getSelectedItem())));
       ap.setMateria(String.valueOf(ComboMaterias.getSelectedItem()));
       ap.settipoExamen(String.valueOf(ComboTipoExamen.getSelectedItem()));
       ap.settotalPreguntas(Integer.parseInt(String.valueOf(totalPreguntas.getValue())));
       ap.setPregExamen(Integer.parseInt(String.valueOf(pregExamen.getValue())));
       ap.setSemestre(Integer.parseInt(String.valueOf(semestre.getValue())));
       ap.setVisible(true);
    }//GEN-LAST:event_SiguienteActionPerformed
    
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
       dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void totalPreguntasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_totalPreguntasStateChanged
        
    }//GEN-LAST:event_totalPreguntasStateChanged

    private void semestreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_semestreStateChanged
       asignar();
    }//GEN-LAST:event_semestreStateChanged
    public void setTotalP(Integer n){
        totalP=n;
    }
    public Integer gettotalP(){
        return totalP;
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
            java.util.logging.Logger.getLogger(CrearExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox ComboCarrera;
    private javax.swing.JComboBox ComboMaterias;
    private javax.swing.JComboBox ComboTipoExamen;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner pregExamen;
    private javax.swing.JSpinner semestre;
    private javax.swing.JSpinner totalPreguntas;
    // End of variables declaration//GEN-END:variables
}
