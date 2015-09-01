package gestioninventarios.modelo;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que se encarga de manejar los productos del sistema. 
 * 
 * @author Oscar Arturo Corona Chavira
 */
public class Producto {
    
    public static final String TABLE = "productos";
    public static final String[] FIELDS = {
        "id", "descripcion", "clasificacion", "precio", "existencia",
        "existencia_maxima", "existencia_minima"};

    private String id;
    private String descripcion;
    private String clasificacion;
    private Double precio;
    private Integer existencia;
    private Integer existenciaMaxima;
    private Integer existenciaMinima;
    
    public Producto(String clave, String descripcion, String clasificacion, Double precio, Integer existencia, Integer existenciaMaxima, Integer existenciaMinima) {
        this.id = clave;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.precio = precio;
        this.existencia = existencia;
        this.existenciaMaxima = existenciaMaxima;
        this.existenciaMinima = existenciaMinima;
    }

    public String getClave() {
        return id;
    }

    public void setClave(String clave) {
        this.id = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Integer getExistenciaMaxima() {
        return existenciaMaxima;
    }

    public void setExistenciaMaxima(Integer existenciaMaxima) {
        this.existenciaMaxima = existenciaMaxima;
    }

    public Integer getExistenciaMinima() {
        return existenciaMinima;
    }

    public void setExistenciaMinima(Integer existenciaMinima) {
        this.existenciaMinima = existenciaMinima;
    }
    
    

    
    public static String fieldsToString(){
        String fieldsStr = "";
        List<String> fieldsToConvert = Arrays.asList(FIELDS);
        
        for (String field : fieldsToConvert) {
            fieldsStr = String.format("%s, %s", fieldsStr, field);
        }
        
        return fieldsStr.replaceFirst(", ", "");
    }
    
}
