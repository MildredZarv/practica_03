/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import javax.swing.table.AbstractTableModel;


public class VerPrestamosAlumno extends AbstractTableModel {
     private ControllerUsuario contUsuario;
     private ControllerLibros contL;
     private UsuarioAlumno uAlumno;
     private Object[] librosPrestados;
     
    @Override
    public int getRowCount() {
        if(librosPrestados!=null){
            return librosPrestados.length;
        }else{
        return 1;
        }//To change body of generated methods, choose Tools | Templates.
    }
    public void setuAlumno(UsuarioAlumno ua){
        uAlumno=ua;
        librosPrestados=ua.ObtenerLibrosP();
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
       return 4; //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Object getValueAt(int i, int i1) {
        if(uAlumno!=null){
//        for (int k = 0; k < libros.size(); k++) {
//           Libros l1=(Libros)librosPrestados[i];
               switch(i1){
            case 0:
                if(uAlumno.getTitulo(i)!=""){
                return uAlumno.getTitulo(i);
                }else{
                    break;
                }
            case 1:
                return uAlumno.getFechaPrestamo(i);
            case 2:
                return uAlumno.getFechaEntrega(i);
            case 3:
                return uAlumno.getMulta();
         }  
            
        
//        }
        }
        return "";
    }
    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0:
                return "Libro";
            case 1:
                return "Fecha de préstamo";
            case 2:
               return "Fecha de entrega";
            case 3:
                return "Multa";
         }
        return "";
    }
    
}
