/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MildReed Zaarv'
 */
public class PruebaControllerLibros {
    public static void main(String []args) throws IOException{
        Scanner teclado=new Scanner(System.in);
        ControllerLibros  cl=new ControllerLibros();
//        Libros l1=new Libros("El principito", "12Uyr39P","Juan Rulfo");
//        Libros l2=new Libros("Crimen y castigo", "e65393Pq","Fiodor Dostoievsky");
//        Libros l3=new Libros("Los numeros primos", "7e52vdj2","National Geographic");
//        try{
//            cl.AgregarLibro(l1);
//        
//        }catch(ObjetoExistente ex){
//            
//        }
//        try{
//            cl.AgregarLibro(l2);
//        
//        }catch(ObjetoExistente ex){
//            
//        }
//        try{
//            cl.AgregarLibro(l3);
//        
//        }catch(ObjetoExistente ex){
//            
//        }
        Object[] o=cl.ObtenerLibro();
        int opcion;
        do{
        System.out.println("Elija una opción: \n1.Mostrar \n2.Modificar \n3. Agregar\n4.Eliminar \n5.Guardar\n6.Salir");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1:
                for (Object o1 : o) {
            System.out.println((Libros)o1);
            }System.out.println("******");
                cl.Mostrar();
                break;
            case 2: 
                System.out.println("Indice");
                int n=teclado.nextInt();
                System.out.println("Introduzca el titulo");
                String titulo=teclado.next();
                System.out.println("Introduzca el autor");
                String autor=teclado.next();
                System.out.println("Introduzca el isbn");
                String isbn=teclado.next();
                Libros u=cl.ModificarLibro(n);
                u.setTitulo(titulo);
                u.setAutor(autor);
                u.setIsbn(isbn);
                break;
            case 3:
                System.out.println("Introduzca el titulo");
                String titulo1=teclado.next();
                System.out.println("Introduzca el autor");
                String autor1=teclado.next();
                System.out.println("Introduzca el isbn");
                String isbn1=teclado.next();
                Libros t=new Libros();
                try{
        cl.AgregarLibro(t);
         cl.Guardar();
        }catch(ObjetoExistente ex){
        
        }
            break;
            case 4:
                System.out.println("Indice del que quiere borrar");
                int k=teclado.nextInt();
                cl.EliminarLibro(k);
                cl.Guardar();
                break;
            case 5:
                cl.Guardar();
                break;
        }
        
        }while(opcion!=6);
//    cl.Mostrar();
//        cl.Guardar();
    
    }
    
}
