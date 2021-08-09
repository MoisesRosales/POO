/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez_tradecash;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.print.attribute.standard.DateTimeAtProcessing;

/**
 *
 * @author UCA
 */
public class Historial {
    
    private String descripcion;
    private double monto;
    private DateTimeAtCreation fecha;
    private Operacion operacion;
    private Cuenta cuenta;
    private Usuario usuario;
    private Categoria categoria;

    public Historial() {
    }

    public Historial(String descripcion, double monto, DateTimeAtCreation fecha, Operacion operacion, Cuenta cuenta, Usuario usuario, Categoria categoria) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
        this.operacion = operacion;
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public DateTimeAtCreation getFecha() {
        return fecha;
    }

    public void setFecha(DateTimeAtCreation fecha) {
        this.fecha = fecha;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void ConsultarH(DateTimeAtCreation UnaFecha,Cuenta UnaCuenta){
        
    }
    public void Ingreso(double UnMonto,Cuenta UnaCuenta){
        
    }
    public void Egreso(double UnMonto,Cuenta UnaCuenta){
        
    }
    
    
}
