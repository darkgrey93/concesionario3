/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 * Clase con los parametros especificos del vendedor.
 * @author fetec
 */
public class Vendedor extends Persona{
    
    private int vehiculosVendidos;
    
    /**
     * Constructor que recibe los parametros especificos del vendedor como los vehiculos vendidos.
     * 
     * @param vehiculosVendidos   
     */
    public Vendedor(StringBuffer nombre, int id, int vehiculosVendidos) {
        super(nombre, id);
        this.vehiculosVendidos=vehiculosVendidos;
    }

    public int getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public void setVehiculosVendidos(int vehiculosVendidos) {
        this.vehiculosVendidos = vehiculosVendidos;
    }
    
    
    
}

