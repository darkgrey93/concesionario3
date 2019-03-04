/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Utilitarios.Deportivos;
import Utilitarios.Estandar;
import Utilitarios.Maquinaria;
import Utilitarios.Persona;
import Utilitarios.Personalizado;
import java.util.ArrayList;
import Utilitarios.Vehiculo;

/**
 *
 * @author Darkgrey93
 */
public class Inventario {
    private ArrayList<Vehiculo> inventario = new ArrayList<Vehiculo>();
    

    public Inventario() {
        StringBuffer marca = new StringBuffer("bmw");
        StringBuffer modelo = new StringBuffer("2000");
        StringBuffer color = new StringBuffer("negro");
        Deportivos deportivo=new Deportivos(marca,modelo,color,1);
        StringBuffer marca1 = new StringBuffer("chevrolet");
        StringBuffer modelo1 = new StringBuffer("2009");
        StringBuffer color1 = new StringBuffer("rojo");
        Estandar estandar=new Estandar(marca1,modelo1,color1,1);
        StringBuffer marca2 = new StringBuffer("caterpillar");
        StringBuffer modelo2 = new StringBuffer("2025");
        StringBuffer color2 = new StringBuffer("amarillo");
        Maquinaria maquinaria=new Maquinaria(marca2,modelo2,color2,1);
        StringBuffer marca3 = new StringBuffer("Tesla");
        StringBuffer modelo3 = new StringBuffer("2019");
        StringBuffer color3 = new StringBuffer("blanco");
        Personalizado turbo=new Personalizado(marca3,modelo3,color3,1);
        
        inventario.add(deportivo);
        inventario.add(estandar);
        inventario.add(maquinaria);
        inventario.add(turbo);
    }

    /**
     * @return the inventario
     */
    public ArrayList<Vehiculo> getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(ArrayList<Vehiculo> inventario) {
        this.inventario = inventario;
    }
    /**
     *Esta funcion agrega el carro sobre el arraylist
     */
    public void agregarCarro(Vehiculo carro){
        inventario.add(carro);
    }
    /**
     *Esta funcion imprime todos los datos de los vehiculos cargaddos en  el inventario
     */
    public void obtenerDatos(){
        int i=0;
        for(Vehiculo vehiculo:inventario){
            System.out.println("marca: "+vehiculo.getMarca()+"\n"
                + "modelo: "+vehiculo.getModelo()+"\n"
                + "color: "+ vehiculo.getColor()+ "\n"
                + "cantidad: "+vehiculo.getCantidad());
            
            System.out.println("indice..."+i);
            i++;
        }
    }
    /**
     *Esta funcion elimina un carro recibiendo su indice
     */
    public void eliminarCarro(int index){
        inventario.remove(index);
    }
    
    
}
