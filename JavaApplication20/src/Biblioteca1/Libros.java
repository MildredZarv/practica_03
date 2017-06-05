/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.Serializable;

/**
 *
 * @author MildReed Zaarv'
 */
public class Libros implements Serializable{
    private String titulo;
    private String isbn;
    private String autor;
    private String Editorial;
    private String edicion;
    private Integer ejemplares;
    private Integer disponibles;
    private String fechaPrestamo;
    private String fechaEntrega;
    private Integer diaP;
    private Integer mesP;
    private Integer anioP;
     private Integer diaE;
    private Integer mesE;
    private Integer anioE;
    private Integer renovaciones;

    public Integer getRenovaciones() {
        return renovaciones;
    }

    public void setRenovaciones(Integer renovaciones) {
        this.renovaciones = renovaciones;
    }
    public Libros(String t, String autor, String isb,String edit,Integer ejemplares, Integer disp){
        titulo=t;
        isbn=isb;
        this.ejemplares=ejemplares;
        disponibles=disp;
        this.autor=autor;
        Editorial=edit;
        
    }
    public Libros(){
//        renovaciones=0;
    }

    public Integer getDiaE() {
        return diaE;
    }

    public void setDiaE(Integer diaE) {
        this.diaE = diaE;
    }

    public Integer getMesE() {
        return mesE;
    }

    public void setMesE(Integer mesE) {
        this.mesE = mesE;
    }

    public Integer getAnioE() {
        return anioE;
    }

    public void setAnioE(Integer anioE) {
        this.anioE = anioE;
    }
    

    public Integer getDiaP() {
        return diaP;
    }

    public void setDiaP(Integer dia) {
        this.diaP = dia;
    }

    public Integer getMesP() {
        return mesP;
    }

    public void setMesP(Integer mes) {
        this.mesP = mes;
    }

    public Integer getAnioP() {
        return anioP;
    }

    public void setAnioP(Integer anio) {
        this.anioP = anio;
    }
    
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }
    
    public String toString(){
        return String.format("%s  \t%s  \t%s", titulo,autor,isbn);
    }
    
    
}
