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
public class Persona {
    private String nombre;
    private String estadoCivil;
    private String sexo;
    private String fechaNacimiento;
    private Integer dia;
    private Integer mes;
    private Integer a�o;
    
    
    public Persona(String n, String ec, String s, Integer a�o, Integer mes, Integer dia){
        nombre=n;
        estadoCivil=ec;
        sexo=s;
        this.a�o=a�o;
        this.mes=mes;
        this.dia=dia;
        fechaNacimiento=dia+"/"+mes+"/"+"/"+a�o;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
     public void setestadoCivil(String n){
        estadoCivil=n;
    }
    public String getestadoCivil(){
        return estadoCivil;
    }
     public void setsexo(String n){
        sexo=n;
    }
    public String getsexo(){
        return sexo;
    }
     
     public void seta�o(Integer n){
         a�o=n;
     }
     public Integer geta�o(){
         return a�o;
     }
     public void setmes(Integer n){
         mes=n;
     }
     public Integer getmes(){
         return mes;
     }
     public void setdia(Integer n){
         dia=n;
     }
     public Integer getdia(){
         return dia;
     }
     public void setfechaNacimiento(){
        fechaNacimiento=dia+"/"+mes+"/"+a�o;
    }
     public String getfechaNacimiento(){
        return fechaNacimiento;
    }
     
    public void ImprimirInf(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de nacimiento: "+fechaNacimiento);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado civil: "+estadoCivil);
    }
    
    
}
