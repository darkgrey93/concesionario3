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
public class Deportivos extends Vehiculo {
    private boolean llantas;
    private boolean convertible;
    
    public Deportivos(StringBuffer marca, StringBuffer modelo, StringBuffer color, int cantidad) {
        super(marca, modelo, color, cantidad);
        this.llantas = true;
        this.convertible = true;
    }

    
    
    @Override
    public void verDetalle() {
        System.out.println("llantas de lujo?"+llantas+"\nconvertible? " +convertible+"\n"+getColor()+"\n"+getMarca()+"\n"+getModelo()+"\n"+getCantidad());
    }

    /**
     * @return the llantas
     */
    public boolean isLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(boolean llantas) {
        this.llantas = llantas;
    }

    /**
     * @return the convertible
     */
    public boolean isConvertible() {
        return convertible;
    }

    /**
     * @param convertible the convertible to set
     */
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    
}
