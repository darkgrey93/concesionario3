/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Utilitarios.Comprador;
import Utilitarios.Estandar;
import Utilitarios.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Darkgrey93
 */
public class Listas {
    
    ArrayList<Persona> listaclientes = new ArrayList<Persona>();
    ArrayList<Factura> listaFacturas = new ArrayList<Factura>();
    /**
     *Esta funcion agrega una factura recibe codigo de factura el identificador del comrpador y del vendedor
     */
    
    public  void agregarFactura(int codigo,int comprador,int vendedor){
        Factura factura=new Factura();
        factura.setCodigo(codigo);
        factura.setComprador(comprador);
        Date fecha=new Date();
        factura.setFecha(fecha);
        factura.setVendedor(vendedor);
        listaFacturas.add(factura);
        
    }
    /**
     *imprime todas las facturas hasta el momento y el total de ventas
     */
    public void mostrarReportes(){
        int i=0;
        for(Factura factura:listaFacturas){
            System.out.println("fecha: "+factura.getFecha()+"\n"
                + "vededor"+factura.getVendedor());
            i++;
            System.out.println("numero de ventas hasta la fecha: "+i);
            
        }
    }
    
    
}
