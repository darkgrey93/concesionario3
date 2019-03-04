/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
import Interfaces.Informacion;

/**
 *
 * @author fetec
 */
public abstract class Vehiculo implements Informacion{
    
    private StringBuffer marca;
    private StringBuffer modelo;
    private StringBuffer color;
    private int cantidad;

    public Vehiculo(StringBuffer marca, StringBuffer modelo, StringBuffer color, int cantidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidad = cantidad;
    }
    
    public void verCantidad(){
        
    }

    public StringBuffer getMarca() {
        return marca;
    }

    public void setMarca(StringBuffer marca) {
        this.marca = marca;
    }

    public StringBuffer getModelo() {
        return modelo;
    }

    public void setModelo(StringBuffer modelo) {
        this.modelo = modelo;
    }

    public StringBuffer getColor() {
        return color;
    }

    public void setColor(StringBuffer color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
