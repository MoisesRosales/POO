/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez_tradecash;

/**
 *
 * @author UCA
 */
public class Categoria {
    
    private String nombre_categoria,descripcion;

    public Categoria() {
        nombre_categoria = null;
        descripcion = null;
    }

    public Categoria(String nombre_categoria, String descripcion) {
        this.nombre_categoria = nombre_categoria;
        this.descripcion = descripcion;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void InsertarCategoria(String nombre,String descripcion){
        
    }
    public void ModificarCategoria(String nombre,String descripcion){
        
    }
    public void EliminarCategoria(String nombre){
        
    }
    public void ConsultarCategoria(String nombre){
        
    }
    
    
    
}
