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
public class Cuenta {
    
    private String nombre_cuenta,descripcion;
    private double valance;

    public Cuenta() {
        nombre_cuenta = null;
        descripcion = null;
        valance = 0.00;
    }

    public Cuenta(String nombre_cuenta, String descripcion, double valance) {
        this.nombre_cuenta = nombre_cuenta;
        this.descripcion = descripcion;
        this.valance = valance;
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValance() {
        return valance;
    }

    public void setValance(double valance) {
        this.valance = valance;
    }
    
    public void ConsultarV(){
        
    }
    
}
