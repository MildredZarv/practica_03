/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
 
import java.util.Random;

public class PreguntasA {
    private String nombre;
    private String materia;
    private String matricula;
    private String tipoExamen;
    private String carrera;
    private Integer pregExamen;
    private Integer semestre;
    private String[] preguntas;
    private Integer[] rand;
    private String[][] arr;
    private Integer[] boton;
    private Integer[] boton1;
    private Integer[] indices;
    private String[] contestar;
    private Integer aciertos;
    private String[][] arr1;
    
    public PreguntasA(){
        preguntas=new String[20];
        arr=new String[20][4];
        rand=new Integer[8];
        boton=new Integer[20];
        pregExamen=rand.length;
        boton1=new Integer[rand.length];
        indices=new Integer[boton.length];
        aciertos=0;
        for (int i = 0; i < boton1.length; i++) {
            boton1[i]=5;
        }
        arr1=new String[rand.length][4];
        contestar=new String[rand.length];
        Random random=new Random();
        preguntas[0]="La derivada respecto a x de x^2 + y^2 =4, es:";
        arr[0][0]="-x/y";
        arr[0][1]="-2x/y";
        arr[0][2]="-x/2y";
        arr[0][3]="x/y";
        boton[0]=1;
        //-x/y -2x/y -x/2y x/y
        preguntas[1]="Tipo de ondas que se propagan en el vacío:";
        arr[1][0]="Ondas mecánicas.";
        arr[1][1]="Ondas Electromagnéticas.";
        arr[1][2]="Ondas sonoras.";
        arr[1][3]="Ninguna de las anteriores.";
        boton[1]=2;
        preguntas[2]="Autor de la Teoría General de la Relatividad:";
        arr[2][0]="James Clerk Maxwell.";
        arr[2][1]="Stephen Hawking.";
        arr[2][2]="Albert Einstein.";
        arr[2][3]="Isaac Newton.";
        boton[2]=3;
        preguntas[3]="Característica principal de las cargas estacionarias:";
        arr[3][0]="Varían con el tiempo.";
        arr[3][1]="Se acumulan en un solo punto.";
        arr[3][2]="No varían con el tiempo.";
        arr[3][3]="Ninguna de las anteriores.";
        boton[3]=3;
        preguntas[4]="Velocidad aproximada de la luz:";
        arr[4][0]="300,000 km/s";
        arr[4][1]="300,000 m/s";
        arr[4][2]="300,000,000 km/s";
        arr[4][3]="300,000 km/h";
        boton[4]=1;
        preguntas[5]="Al convertir 30°C a Fahrenheit se obtiene:";
        arr[5][0]="86°F";
        arr[5][1]="36°F";
        arr[5][2]="44°F";
        arr[5][3]="243°F";
        boton[5]=1;
        //86 36 44 243
        preguntas[6]="Cambio en la velocidad que experimenta una onda al pasar de un medio a otro:";
        arr[6][0]="Difracción";
        arr[6][1]="Reflexión.";
        arr[6][2]="Refracción";
        arr[6][3]="Interferencia";
        boton[6]=3;
        //Refracción reflexión difracción interferencia
        preguntas[7]="Es la variación de la carga con respecto del tiempo:";
        arr[7][0]="Intensidad de corriente.";
        arr[7][1]="Potencia.";
        arr[7][2]="Diferencia de potencial.";
        arr[7][3]="Ninguna de las anteriores";
        boton[7]=1;
        //intensidad de corriente diferencia de potencial- potencia -ninguna de las anteriores
        preguntas[8]="El número binario 101111 escrito en decimal es:  ";
        arr[8][0]="51";
        arr[8][1]="79";
        arr[8][2]="43";
        arr[8][3]="47";
        boton[8]=4;
        // 47 43 51 79
        preguntas[9]="Si f(2)=8 y g(2)=4, el resultado de 2f(2)-3g(2), es:";
        arr[9][0]="0";
        arr[9][1]="2";
        arr[9][2]="4";
        arr[9][3]="8";
        boton[9]=3;
        //4 0 2 8
        preguntas[10]="si f(x)=x-1 y g(x)=x^2 + 1, el resultado de f ° g, es:";
        arr[10][0]="x^2";
        arr[10][1]="x^2 - 1";
        arr[10][2]="x^2 + 1";
        arr[10][3]="x^2 -2";
        boton[10]=1;
        //x^2 x^2-1 x^2+1 x^2-2
        preguntas[11]="Si f(x)=x y g(x)=x^2 -2x, el resultado de g / f es:";
        arr[11][0]="x^3 - 2x^2";
        arr[11][1]="x-2";
        arr[11][2]="x+2";
        arr[11][3]="x^2 -2x";
        boton[11]=2;
        // x-2 x^3-2x^2 x+2 x^2-2x
        preguntas[12]="Afirma que el factor económico es determinante en la historia:";
        arr[12][0]="Idealismo.";
        arr[12][1]="Historicismo";
        arr[12][2]="Estructuralismo.";
        arr[12][3]="Materialismo histórico";
        boton[12]=4;
        //Materialismo histórico estructuralismo historicismo idealismo
        preguntas[13]="Movimiento intelectual y humanístico de Italia que surge en 1453";
        arr[13][0]="Ilustración.";
        arr[13][1]="Renacimiento.";
        arr[13][2]="Iluminismo.";
        arr[13][3]="Positivismo.";
        boton[13]=2;
        //Renacimiento-Ilustración-Iluminismo-Positivismo
        preguntas[14]="Consiste en disolver los diptongos en un verso por licencia poética:";
        arr[14][0]="Hiato.";
        arr[14][1]="Sinéresis.";
        arr[14][2]="Sinalefa.";
        arr[14][3]="Diéresis.";
        boton[14]=4;
        //Diéresis-Hiato-Sinéresis-Sinalefa
        preguntas[15]="Ejemplo de Literatura Griega: ";
        arr[15][0]="El Cantar de Roldán.";
        arr[15][1]="Virgilio.";
        arr[15][2]="El Ramanaya.";
        arr[15][3]="Esquilo.";
        boton[15]=4;
        //Esquilo- El Ramanaya-Virgilio-El Cantar de Roldán
        preguntas[16]="La energía cinética total del sistema, antes y después del choque, cambia:";
        arr[16][0]="Choque elástico";
        arr[16][1]="Choque inelástico.";
        arr[16][2]="Todas las anteriores.";
        arr[16][3]="Ninguna de las anteriores.";
        boton[16]=2;
        //choque inelástico- choque elastico
        preguntas[17]="Propuso que la luz estaba formado por ondas electromagnéticas:";
        arr[17][0]="James Clerk Maxwell.";
        arr[17][1]="Nikola Tesla.";
        arr[17][2]="Michael Faraday.";
        arr[17][3]="Isaac Newton.";
        boton[17]=1;
        // James Clerk Maxwell - Nikola Tesla- Michael Faraday - Isaac Newton
        preguntas[18]="Rayos producidos durante las transformaciones nucleares:";
        arr[18][0]="Rayos X.";
        arr[18][1]="Rayos ultravioleta.";
        arr[18][2]="Rayos Gamma.";
        arr[18][3]="Rayos infrarrojos.";
        boton[18]=3;
        //Rayos gamma - Rayos infrarrojos - Rayos ultravioleta - Rayos X
        preguntas[19]="La corriente que circula por un conductor induce un campo magnético.";
        arr[19][0]="Ley de Lenz.";
        arr[19][1]="Ley de Faraday.";
        arr[19][2]="Ley de Ampere..";
        arr[19][3]="Ley de Gauss.";
        boton[19]=3;
        //Ley de Ampere -Ley de Lenz - Ley de Faraday -Ley de Gauss.
        
        for (int i = 0; i < rand.length; i++) {
            rand[i]=random.nextInt(19)+1;
//            System.out.print(rand[i]+" ");
            if(i>0){
            for (int j = i-1; -1 < j; j--) {
                if(rand[i]==rand[j]){
                    do{
                    rand[i]=random.nextInt(19)+1;
                    }while(rand[i]==rand[j]);
                }
            }
            }
            contestar[i]=preguntas[rand[i]];
            arr1[i][0]=arr[rand[i]][0];
            arr1[i][1]=arr[rand[i]][1];
            arr1[i][2]=arr[rand[i]][2];
            arr1[i][3]=arr[rand[i]][3];
            indices[i]=boton[rand[i]];
        }
    }
    public void mostrarPreguntasyRespuestas(){
        for (int i = 0; i < contestar.length; i++) {
            System.out.println((i+1)+"."+contestar[i]);
            System.out.println(arr1[i][0]);
            System.out.println(arr1[i][1]);
            System.out.println(arr1[i][2]);
            System.out.println(arr1[i][3]);
            System.out.println(indices[i]);
        }
    }
    
    public String getPregunta(Integer n){
        return contestar[n];
    }
    public String getRespuesta(Integer n,Integer i){
        return arr1[n][i];
    }
    public String mostrarContestar(Integer i){
            if(boton1[i]==indices[i]){
                aciertos++;
                return ((i+1)+". "+contestar[i]+" CORRECTO\n  Tu respuesta: "+arr1[i][boton1[i]-1]+"\n  Respuesta correcta: "+arr1[i][indices[i]-1]);
                
            }else{
                return ((i+1)+". "+contestar[i]+" INCORRECTA\n  Tu respuesta: "+arr1[i][boton1[i]-1]+"\n  Respuesta correcta: "+arr1[i][indices[i]-1]);
            }
    }
    public Integer getAciertos(){
        return aciertos;
    }
    public void mostrarNumeros(){
        System.out.println("");
        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i]+" ");
            System.out.println(contestar[i]);
        }
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

    public void setNombre(String nmb){
        nombre=nmb;
    }
    public String getNombre(){
        return nombre;
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

    public Integer getPregExamen() {
        return pregExamen;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public String[] getPreguntas() {
        return preguntas;
    }

    public String[][] getArr() {
        return arr;
    }
    
     public void setBoton1(Integer btn, Integer op) {
        boton1[btn]=op;
    }
    public Integer getBoton1(Integer c) {
        return boton1[c];
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

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public void setArr(String[][] arr) {
        this.arr = arr;
    }

   
//    public static void main(String[]args){
//        PreguntasA a=new PreguntasA(); 
//        a.mostrarPreguntasyRespuestas();
//        
//    }
    
}
