/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 *
 * @author Darkgrey93
 */
public class Maquinaria extends Vehiculo{
    private boolean bodega;
    private boolean gancho;
    
    public Maquinaria (StringBuffer marca, StringBuffer modelo, StringBuffer color, int cantidad) {
        super(marca, modelo, color, cantidad);
        this.bodega = true;
        this.gancho = true;
    }
    
    @Override
    public void verDetalle() {
        System.out.println("tiene bodega?"+bodega+"\ntiene gancho?" +gancho+"\n"+getColor()+"\n"+getMarca()+"\n"+getModelo()+"\n"+getCantidad());
    }

    /**
     * @return the bodega
     */
    public boolean isBodega() {
        return bodega;
    }

    /**
     * @param bodega the bodega to set
     */
    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    /**
     * @return the gancho
     */
    public boolean isGancho() {
        return gancho;
    }

    /**
     * @param gancho the gancho to set
     */
    public void setGancho(boolean gancho) {
        this.gancho = gancho;
    }
    
    
    
}
