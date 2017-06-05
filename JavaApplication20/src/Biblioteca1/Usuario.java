/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author MildReed Zaarv'
 */
public class Usuario implements Serializable{
    private String nombre;
    private String matricula;
    private String telefono;
    private Integer maxDias;
    private Integer librosPermitidos;
    private String usuario;
    private String contraseña;
    private String tipoUsuario;
    
    public Usuario (String name, String mat, String tel,String usuario, String cont) throws UnsupportedEncodingException{
        nombre=name;
        matricula=mat;
        telefono=tel;
        this.usuario=usuario;
        contraseña=convertToMD5(cont);
    }
    public Usuario(){
        
    }
     public  String convertToMD5(final String md5) throws UnsupportedEncodingException{
        StringBuffer sb=null;
        try{
            final java.security.MessageDigest md= java.security.MessageDigest.getInstance("MD5");
            final byte[] array=md.digest(md5.getBytes("UTF-8"));
            sb=new StringBuffer();
            for (int i = 0; i <array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }return sb.toString();
        }catch(final java.security.NoSuchAlgorithmException e){
            
        }return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s \t%s \t%s", nombre,matricula,telefono);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getMaxDias() {
        return maxDias;
    }

    public Integer getLibrosPermitidos() {
        return librosPermitidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) throws UnsupportedEncodingException {
        this.contraseña = convertToMD5(contraseña);
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
    
    
}
