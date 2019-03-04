/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 * Clase que tiene la informacion heradada a el comprador y el vendedor
 * @author fetec
 */
public abstract class Persona {
    private StringBuffer nombre;
    private int id;
    
    /**
     * Constructor que recibe los parametros globales de nombre y id.
     * @param nombre
     * @param id 
     */
    public Persona(StringBuffer nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public StringBuffer getNombre() {
        return nombre;
    }

    public void setNombre(StringBuffer nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
