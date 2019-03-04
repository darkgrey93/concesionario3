/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
/**
 * Clase con los parametros especificos del comprador
 * @author fetec
 */
public class Comprador extends Persona{
    
    private StringBuffer correo;
    
    /**
     * Constructor que recibe los parametros especificos del comprador como correo.
     * 
     * @param correo  
     */
    public Comprador(StringBuffer nombre, int id, StringBuffer correo) {
        super(nombre, id);
        this.correo=correo;
    }

    public StringBuffer getCorreo() {
        return correo;
    }

    public void setCorreo(StringBuffer correo) {
        this.correo = correo;
    }
}