/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import javax.swing.table.AbstractTableModel;


public class TableModelUsuario extends AbstractTableModel {
     private ControllerUsuario contUsuario;
     private Object[] usuarioController;
     public TableModelUsuario(){
         
     }
     public void setContUsuario(ControllerUsuario cu){
         contUsuario=cu;
         usuarioController=cu.ObtenerAlumnos();
     }
     @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getRowCount() {
         if(contUsuario!=null){
        usuarioController=contUsuario.ObtenerAlumnos();
//            for (Object librosController1 : librosController) {
//                System.out.println(librosController1);
//            }System.out.println();
//            System.out.println("length: "+librosController.length);
          return usuarioController.length;
        }else{
        return 1;
        }
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
     public String getColumnName(int i) {
        switch(i){
            case 0:
                return "NOMBRE";
            case 1:
               return "MATRÍCULA";
            case 2:
                return "TELÉFONO";
            case 3:
                return "CARRERA";
            case 4:
                return "SEMESTRE";
            case 5:
                return "USUARIO";
            case 6:
                return "PRÉSTAMOS";
                
        }
        return super.getColumnName(0); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if(contUsuario!=null){
//        for (int k = 0; k < libros.size(); k++) {
           UsuarioAlumno u1=(UsuarioAlumno)usuarioController[i];
               switch(i1){
            case 0:
                return u1.getNombre();
            case 1:
                return u1.getMatricula();
            case 2:
                return u1.getTelefono();
            case 3:
                return u1.getCarrera();
            case 4:
                return u1.getSemestre();
            case 5:
                return u1.getUsuario();
            case 6:
                return u1.getTotalLibros();
         }  
            
        
//        }
        }
        return "";
    }
    
}
