/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author MildReed Zaarv'
 */
public class UsuarioAdministrador extends Usuario {
    public UsuarioAdministrador(String name, String mat, String tel,String usuario, String cont) throws UnsupportedEncodingException{
        super(name,mat,tel,usuario,cont);
        super.setTipoUsuario("Administrador");
    }
    public UsuarioAdministrador(){
        
    }
    
}
