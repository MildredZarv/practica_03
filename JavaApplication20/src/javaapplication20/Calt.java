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
import java.util.Scanner;
public class Calt {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String operacion=in.next();
        System.out.println("posicion: "+posicion(operacion));
        
    }
    
    public static int posicion(String a){
        int n=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='+'){
                n=i;
                i=a.length();
                
            }
        }
        return n;
    }
}
