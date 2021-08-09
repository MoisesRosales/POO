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
public class Operacion {
    
    private String nombre_operacion;

    public Operacion() {
        nombre_operacion = null;
    }

    public Operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }

    public String getNombre_operacion() {
        return nombre_operacion;
    }

    public void setNombre_operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }
}
