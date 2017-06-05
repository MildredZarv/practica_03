/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class PruebaControllerUsuario {
    private String nombre;
    private String mat;
    private String tel;
    public static void main(String[]args) throws IOException{
        Scanner teclado=new Scanner(System.in);
        ControllerUsuario cont=new ControllerUsuario();
//        Usuario u8=new Usuario();
//         Usuario u2=new Usuario();
//        try{
//        cont.AgregarUsuario(u8);
//        }catch(ObjetoExistente ex){
//        }
//        try{
//        cont.AgregarUsuario(u2);
//        }catch(ObjetoExistente ex){
//        }
        Integer opcion;
        Object[] o=cont.ObtenerUsuarios();
        for (Object o1 : o) {
            System.out.println(o1);
        }
        do{
        System.out.println("Elija una opción: \n1.Mostrar \n2.Modificar \n3. Agregar\n4.Eliminar \n5.Guardar\n6.Eliminar");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1:
                for (Object o1 : o) {
            System.out.println((Usuario)o1);
            }System.out.println("******");
                cont.Mostrar();
                break;
            case 2: 
                System.out.println("Indice");
                int n=teclado.nextInt();
                System.out.println("Introduzca el nombre");
                String name=teclado.next();
                System.out.println("Introduzca la matrícula");
                String mat=teclado.next();
                System.out.println("Introduzca el teléfono");
                String tel=teclado.next();
                Usuario u=cont.ModificarUsuario(n);
                u.setNombre(name);
                u.setMatricula(mat);
                u.setTelefono(tel);
                
                break;
            case 3:
               System.out.println("Introduzca el nombre");
                String name1=teclado.next();
                System.out.println("Introduzca la matrícula");
                String mat1=teclado.next();
                System.out.println("Introduzca el teléfono");
                String tel1=teclado.next(); 
                Usuario t=new Usuario();
                try{
        cont.AgregarUsuario(t);
         cont.Guardar();
        }catch(ObjetoExistente ex){
        
        }
            break;
            case 4:
                System.out.println("Indice del que quiere borrar");
                int k=teclado.nextInt();
                cont.EliminarUsuario(k);
                cont.Guardar();
                break;
            case 5:
                cont.Guardar();
                break;
        }
        
        }while(opcion!=6);
    }
    
}
