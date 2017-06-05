/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MildReed Zaarv'
 */
public class ControllerUsuario {
    private HashSet<Usuario> usuarios;
    private HashSet<UsuarioAlumno> uAlumnos;
    
    public ControllerUsuario(){
//        usuarios=new HashSet();
        File file=new File("Usuarios.dat");
        if(file.exists()){
            usuarios=cargarUsuarios();
        }else{
            usuarios=new HashSet();
        }
        File file1=new File("UsuariosAlumnos.dat");
        if(file1.exists()){
            uAlumnos=cargarAlumnos();
        }else{
            uAlumnos=new HashSet();
        }
        
    }
    
    public void AgregarUsuario(Usuario us)throws ObjetoExistente{
        if(!usuarios.add(us)){
            throw new ObjetoExistente();
        }else{
            usuarios.add(us);
        }
    }
    public void AgregarUsuarioAlumno(UsuarioAlumno us)throws ObjetoExistente{
        if(!uAlumnos.add(us)){
            throw new ObjetoExistente();
        }else{
            uAlumnos.add(us);
        }
    }
     public void GuardarAlumnos()throws FileNotFoundException, IOException {
//        throws FileNotFoundException, IOException
        try{
            File file=new File("UsuariosAlumnos.dat");
            FileOutputStream output=new FileOutputStream(file);
            ObjectOutputStream writer=new ObjectOutputStream(output);
            writer.writeObject(uAlumnos);
            writer.close();
            output.close();
//            System.out.println("Se agregó un alumno");
        }catch(IOException ex){
        
        }
    }
    
    public void Guardar()throws FileNotFoundException, IOException {
//        throws FileNotFoundException, IOException
        try{
            File file=new File("Usuarios.dat");
            FileOutputStream output=new FileOutputStream(file);
            ObjectOutputStream writer=new ObjectOutputStream(output);
            writer.writeObject(usuarios);
            writer.close();
            output.close();
        }catch(IOException ex){
        
        }
    }
    
    private HashSet<Usuario> cargarUsuarios() {
        try{
            File file=new File("Usuarios.dat");
            FileInputStream input=new FileInputStream(file);
            ObjectInputStream reader=new ObjectInputStream(input);
            HashSet<Usuario> retorno=(HashSet<Usuario>) reader.readObject();
            reader.close();
            input.close();
            return retorno;
        }catch(IOException ex){
            
        
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }return null;
    }
    private HashSet<UsuarioAlumno> cargarAlumnos() {
        try{
            File file=new File("UsuariosAlumnos.dat");
            FileInputStream input=new FileInputStream(file);
            ObjectInputStream reader=new ObjectInputStream(input);
            HashSet<UsuarioAlumno> retorno=(HashSet<UsuarioAlumno>) reader.readObject();
            reader.close();
            input.close();
            return retorno;
        }catch(IOException ex){
            
        
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }return null;
    }
    public Object[] ObtenerAlumnos(){
        return uAlumnos.toArray();
    }
    
    public Object[] ObtenerUsuarios(){
        return usuarios.toArray();
    }
     public UsuarioAlumno  ModificarAlumno(Integer n){
        Object[] us=ObtenerAlumnos();
        return (UsuarioAlumno)us[n];
    }
    public Usuario  ModificarUsuario(Integer n){
        Object[] us=ObtenerUsuarios();
        return (Usuario)us[n];
    }
    public void EliminarUsuario(Integer n){
     Object[] us=ObtenerUsuarios();
     usuarios.remove((Usuario)us[n]);
    }
    public void EliminarAlumno(Integer n){
     Object[] us=ObtenerAlumnos();
     uAlumnos.remove((UsuarioAlumno)us[n]);
    }
    public void Mostrar(){
        for (Usuario usuario : usuarios) {
            System.out.println(usuario+" "+usuario.getUsuario()+" "+usuario.getContraseña());
        }
    }
    public void MostrarAlumnos(){
        for (UsuarioAlumno usuario : uAlumnos) {
            System.out.println(usuario);
        }
    }
}
