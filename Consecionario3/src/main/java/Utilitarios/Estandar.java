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
public class Estandar extends Vehiculo {
    

    public Estandar(StringBuffer marca, StringBuffer modelo, StringBuffer color, int cantidad) {
        super(marca, modelo, color, cantidad);
    }
    @Override
    public void verDetalle() {
        System.out.println("equipamiento estandar"+"\n"+getColor()+"\n"+getMarca()+"\n"+getModelo()+"\n"+getCantidad());
    }
    
}
