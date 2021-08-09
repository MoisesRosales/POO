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
public class Usuario {
    
    private String nombre_usuario,contraseña;

    public Usuario() {
        nombre_usuario = null;
        contraseña = null;
    }

    public Usuario(String nombre_usuario, String contraseña) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void RecuperarC(String usuario){
        
    }
    
}
