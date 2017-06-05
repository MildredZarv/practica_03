/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MildReed Zaarv'
 */
public class TableModelLibros extends AbstractTableModel {
    private ControllerLibros controller;
    private Object[] librosController;
    public TableModelLibros(){
        
    }
    public TableModelLibros(ControllerLibros cl){
        controller=cl;
        librosController=cl.ObtenerLibro();
    }

    public ControllerLibros getController() {
        return controller;
    }

    public void setController(ControllerLibros controller) {
        this.controller = controller;
    }
    

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0:
                return "TÍTULO";
            case 1:
                return "AUTOR";
            case 2:
               return "ISBN";
            case 3:
                return "EDITORIAL";
            case 4:
                return "EJEMPLARES";
            case 5:
                return "DISPONIBLES";
                
        }
        return super.getColumnName(0); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getRowCount() {
        if(controller!=null){
        librosController=controller.ObtenerLibro();
          return librosController.length;
        }else{
        return 1;
        }
    }
    private String string;
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }


    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if(librosController!=null){
//        for (int k = 0; k < libros.size(); k++) {
           Libros l1=(Libros)librosController[i];
               switch(i1){
            case 0:
                return l1.getTitulo();
            case 1:
                return l1.getAutor();
            case 2:
                return l1.getIsbn();
            case 3:
                return l1.getEditorial();
            case 4:
                return l1.getEjemplares();
            case 5:
                return l1.getDisponibles();
         }  
            
        
//        }
        }
        return "";
        
    }

    
}
