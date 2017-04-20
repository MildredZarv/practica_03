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
public class PreguntasM {
    private String materia;
    private String tipoExamen;
    private String carrera;
    private Integer totalPreguntas;
    private Integer pregExamen;
    private Integer semestre;
    private String[] preguntas;
    private String[][] arr;
    private Integer[] boton;
    public PreguntasM(){
   
    }
    public void setSemestre(Integer n){
        semestre=n;
    }
    public Integer getSemestre(){
        return semestre;
    }
    
     public void setPreguntas(String str, Integer i){
        preguntas[i]=str;
    }


    public String getPregunta(Integer n) {
        return preguntas[n];
    }
    

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setTotalPreguntas(Integer totalPreguntas) {
        this.totalPreguntas = totalPreguntas;
        preguntas=new String[totalPreguntas];
        arr=new String[totalPreguntas][4];
        boton=new Integer[totalPreguntas];
    }

    public void setPregExamen(Integer pregExamen) {
        this.pregExamen = pregExamen;
    }

    public String getMateria() {
        return materia;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public String getCarrera() {
        return carrera;
    }

    public Integer getTotalPreguntas() {
        return totalPreguntas;
    }

    public Integer getPregExamen() {
        return pregExamen;
    }
    public Integer getbtn(Integer n){
        return boton[n];
    }
    public void setRespuestas(Integer veinte, Integer cuatro, String str,Integer btn){
        arr[veinte][cuatro]=str;
        boton[veinte]=btn;
    }
    public void mostrarTodas(){
        for (int i = 0; i < arr.length; i++) {
           System.out.println((i+1)+". ");
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            
        }
    }
    public void mostrarFila(Integer n){
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[n][i]+" ");
        }
    }
    public String mostrarUna(Integer n, Integer b){
        return arr[n][b];
    }
    public void preguntasAgregadas(){
        for (int i = 0; i < preguntas.length; i++) {
            if(preguntas[i]!=null){
            System.out.println((i+1)+"."+preguntas[i]);
            }else{
                i=preguntas.length;
            }
        }
    }
    public void mostrarInformacion(){
        System.out.println("LICENCIATURA: "+carrera);
        System.out.println("ASIGNATURA: "+materia);
        System.out.println("TIPO DE EXAMEN: "+tipoExamen);
        System.out.println("TOTAL DE PREGUNTAS: "+totalPreguntas);
        for (int i = 0; i < totalPreguntas; i++) {
            System.out.println((i+1)+". "+preguntas[i]);
        }
        mostrarTodas();
        System.out.println("PREGUNTAS A RESPONDER: "+pregExamen);
        
 
    }
}
