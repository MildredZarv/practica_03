/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca1;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;

/**
 *
 * @author MildReed Zaarv'
 */
public class UsuarioAlumno extends Usuario{
    private String carrera;
    private Integer semestre;
    private Integer maxDias=3;
    private Integer librosPermitidos=2;
    private Libros libro1;
    private HashSet<Libros> librosPrestados;
    private Double multa;
    private Integer renovaciones;

    public Integer getRenovaciones(Integer n) {
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
        renovaciones=libro1.getRenovaciones();
        libro1.setRenovaciones(renovaciones);
        return renovaciones;
    }
    public void EliminarLibro(Integer n){
        Object[] us=ObtenerLibrosP();
     librosPrestados.remove((Libros)us[n]);
        System.out.println("Se eliminó un libro");
    }
    
    public boolean RenovarLibro(Integer n){
         Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
        renovaciones=libro1.getRenovaciones()+1;
        libro1.setRenovaciones(renovaciones);
        if(renovaciones<3){
           setFechaEntrega(n);
        return true;
        }else{
            return false;
        }
    }
     public UsuarioAlumno(String name, String mat, String tel,String usua, String cont, String carr, Integer sem) throws UnsupportedEncodingException{
        super(name,mat,tel,usua,cont);
        libro1=new Libros();
        multa=0.0;
        carrera=carr;
        semestre=sem;
        librosPrestados=new HashSet<Libros>();
        super.setTipoUsuario("Alumno");
    }
     

    public HashSet<Libros> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libros> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
     
    public UsuarioAlumno(){
        
    }
    
    public Integer getTotalLibros(){
        return librosPrestados.size();
    }

    public Double getMulta() {
        return multa;
    }
    public String getTitulo(Integer n){
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
        if(libro1.getTitulo()!=null){
            
        return libro1.getTitulo();
        }else{
        return "";
        }
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }
    
    public void setFechaPrestamo(Integer n){
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
        libro1.setFechaEntrega(libro1.getDiaP()+"/"+libro1.getMesP()+"/"+libro1.getAnioP());
    }
    public void setFechaEntrega(Integer n){
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
        if(renovaciones>0){
        getDiaEntrega(n);
        }
        libro1.setFechaEntrega(libro1.getDiaE()+"/"+libro1.getMesE()+"/"+libro1.getAnioE());
    }
    public String getFechaPrestamo(Integer n){
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
        return libro1.getDiaP()+"/"+libro1.getMesP()+"/"+libro1.getAnioP();
    }
    public String getFechaEntrega(Integer n){
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
       return  libro1.getDiaE()+"/"+libro1.getMesE()+"/"+libro1.getAnioE();
    }
    
    public Object[] ObtenerLibrosP(){
        return librosPrestados.toArray();
    }
    public void setLibrosPrestados(Libros l1) throws ObjetoExistente{
         if(!librosPrestados.add(l1)){
            throw new ObjetoExistente();
        }else{
            librosPrestados.add(l1);
        }
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

    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    @Override
    public Integer getLibrosPermitidos() {
        return  librosPermitidos;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getMaxDias() {
        return maxDias; //To change body of generated methods, choose Tools | Templates.
    }
     
    public void getDiaEntrega(Integer n){
        Object[] oLib=ObtenerLibrosP();
        libro1=(Libros)oLib[n];
//        Integer mes1=
        if(libro1.getDiaE()<=27 && libro1.getMesE()!=2){
            libro1.setDiaP(libro1.getDiaE());
            libro1.setDiaE(libro1.getDiaE() + 3);
        }else if(libro1.getDiaE()==28){
            if( libro1.getMesE()==4 || libro1.getMesE()==6 || libro1.getMesE()==9 || libro1.getMesE()==11){
                libro1.setDiaP(libro1.getDiaE());
                libro1.setMesE(libro1.getMesE());
                libro1.setDiaP(libro1.getDiaE());
                libro1.setDiaE(1);
                libro1.setMesE(libro1.getMesP() + 1);
                libro1.setAnioE(libro1.getAnioP());
            }else if(libro1.getMesE()==2){
                    libro1.setDiaP(libro1.getDiaE());
                libro1.setMesE(libro1.getMesE());
                libro1.setDiaP(libro1.getAnioE());
                    libro1.setDiaE(3);
                    libro1.setMesE(3);
                    libro1.setAnioE(libro1.getAnioP());
            }else{
                libro1.setDiaP(libro1.getDiaE());
                libro1.setMesE(libro1.getMesE());
                libro1.setDiaP(libro1.getAnioE());
                 libro1.setDiaE(31);
                 libro1.setMesE(libro1.getMesP());
                 libro1.setAnioE(libro1.getAnioP());
            }
        }
   }
    
  
    
}
