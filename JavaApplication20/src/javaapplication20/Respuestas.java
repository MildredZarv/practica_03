/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author MildReed Zaarv'
 */
public class Respuestas {
    public String [][] arr;
    public Respuestas(){
        
    }
    public void setTamaño(Integer a){
        arr=new String[a][4];
    }
    public void setRespuestas(Integer veinte, Integer cuatro, String str){
        arr[veinte][cuatro]=str;
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
    public String respuesta(Integer n,Integer a){
        return arr[n][a];
    }
    public String mostrarUna(Integer n, Integer b){
        return arr[n][b];
    }
    
    
}
