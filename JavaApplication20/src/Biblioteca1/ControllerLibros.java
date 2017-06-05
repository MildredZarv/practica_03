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
public class ControllerLibros {
    private HashSet<Libros> libros;
    
    public ControllerLibros(){
    File file=new File("Libros.dat");
        if(file.exists()){
            libros=cargarLibros();
        }else{
            libros=new HashSet();
        }
    }
    private HashSet<Libros> cargarLibros() {
        try{
            File file=new File("Libros.dat");
            FileInputStream input=new FileInputStream(file);
            ObjectInputStream reader=new ObjectInputStream(input);
            HashSet<Libros> retorno=(HashSet<Libros>) reader.readObject();
            reader.close();
            input.close();
            return retorno;
        }catch(IOException ex){
            
        
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }return null;
    }
    public void AgregarLibro(Libros lb) throws ObjetoExistente{
        if(!libros.add(lb)){
            throw new ObjetoExistente();
        }else{
            libros.add(lb);
        }
    }
    public void EliminarLibro(Integer n){
        Object[] us=ObtenerLibro();
     libros.remove((Libros)us[n]);
    }
    public Object[] ObtenerLibro(){
        return libros.toArray();
    }
    public Libros ModificarLibro(Integer n){
        Object[] us=ObtenerLibro();
        return (Libros)us[n];
    }
    public void Guardar()throws FileNotFoundException, IOException {
//        throws FileNotFoundException, IOException
        try{
            File file=new File("Libros.dat");
            FileOutputStream output=new FileOutputStream(file);
            ObjectOutputStream writer=new ObjectOutputStream(output);
            writer.writeObject(libros);
            writer.close();
            output.close();
        }catch(IOException ex){
        
        }
    }
    public void Mostrar(){
        for (Libros lib : libros) {
            System.out.println(lib);
        }
    }
}
