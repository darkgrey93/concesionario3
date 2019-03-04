/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Utilitarios.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Darkgrey93
 */
public class Core {
    public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    Scanner entradaEscaner = new Scanner (System.in);
    Inventario inventario=new Inventario();
    Listas listas=new Listas();
    /**
     *Es el primer menu en el cual se elige el rol a usar
     */
    public void primerMenu(){
        System.out.println("Quien eres? \n "
                + "cliente .1 \n"
                + "vendedor.2\n"
                + "Salir .3");
        int opcion=0;
        try {
            opcion = Integer.parseInt((entrada.readLine()));
        } catch (IOException ex) {
            Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch(opcion){
            case 1:
                menuCliente();
                break;
            case 2:
                menuVendedor();
                primerMenu();
                break;
            case 3:
                System.out.println("terminando programa...");
                System.exit(0);
                break;
    
        }
    }
        
    /**
     *Este metodo se usa para hacer el menu del cliente
     */
    public void menuCliente(){
            
            System.out.println("Que desea hacer? \n"
                + "ver autos .1 \n"
                + "Salir .2");  
            int opcion=0;
            try {
                opcion = Integer.parseInt((entrada.readLine()));
            } catch (IOException ex) {
                Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch(opcion){
                case 1:
                    mostrarCarros();
                    break;
                case 2:
                    System.out.println("terminando programa...");
                    System.exit(0);
                    break;
            }
        
    }
    /**
     *Este es el menu del vendedor
     */
    public void menuVendedor(){
            
            System.out.println("Que desea hacer? \n"
                + "Agregar autos .1 \n"
                + "ver reportes .2 \n"
                + "vender .3 \n"
                + "ver inventario .4 \n"
                + "Salir .5");  
            int opcion=0;
            try {
                opcion = Integer.parseInt((entrada.readLine()));
            } catch (IOException ex) {
                Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch(opcion){
                case 1:
                    agregarCarro();
                    primerMenu();
                    break;
                case 2:
                    listas.mostrarReportes();
                    break;
                case 3:
                    mostrarCarros();
                    System.out.println("escriba el indice del auto que desea comprar... \n");
                    try {
                        opcion = Integer.parseInt((entrada.readLine()));
                    } catch (IOException ex) {
                        Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    vender(opcion);
                    System.out.println("carro vendido¡¡¡¡¡¡");
                    break;
                case 4:
                    
                    mostrarCarros();
                    System.out.println("estos son todos los carros");
                    break;
                case 5:
                    System.out.println("terminando programa...");
                    System.exit(0);
                    break;
            }
        
    }
    /**
     *esta funcion se utiliza para gregar un carro
     */
    public void agregarCarro(){
        System.out.println("Que aunto desea agregar?"
                + "Deportivo .1"
                + "Personalizado .2"
                + "Maquinaria .3"
                + "Estadar .4");
        int opcion=0;
        try {
            opcion = Integer.parseInt((entrada.readLine()));
        } catch (IOException ex) {
            Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Escoja los datos del nuevo auto");
        String marca1="";
        String modelo1="";
        String color1="";
        int cantidad = 0;
        System.out.println("digite marca");
        try {
            marca1 = entrada.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("digite modelo");
        try {
            modelo1 = entrada.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("digite color");
        try {
            color1 = entrada.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("digite la cantidad a ingresar");
        try {
            cantidad = Integer.parseInt(entrada.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Core.class.getName()).log(Level.SEVERE, null, ex);
        }
        StringBuffer marca = new StringBuffer(marca1);
        StringBuffer modelo = new StringBuffer(modelo1);
        StringBuffer color = new StringBuffer(color1);
  
        
        
        switch(opcion){
            case 1:
                Deportivos nuevoDeportivo=new Deportivos(marca,modelo,color,cantidad);
                inventario.agregarCarro(nuevoDeportivo);
                System.out.println("carro agregado");
                break;
            case 2://personalizado
                Personalizado nuevoPersonalizado=new Personalizado(marca,modelo,color,cantidad);
                inventario.agregarCarro(nuevoPersonalizado);
                System.out.println("carro agregado");
                break;
            case 3://maquinaria
                Maquinaria nuevoMaquinaria=new Maquinaria(marca,modelo,color,cantidad);
                inventario.agregarCarro(nuevoMaquinaria);
                System.out.println("carro agregado");
                break;
            case 4:// Estandar
                Estandar nuevoEstandar=new Estandar(marca,modelo,color,cantidad);
                inventario.agregarCarro(nuevoEstandar);
                System.out.println("carro agregado");
                break;
        }
    }
    /**
     *Esta funcion se utiliza para vender recibe el indice del carro a vender
     */
    public void vender(int opcion){
        
        int code=listas.listaFacturas.size();
        listas.agregarFactura(code, 1, 1);
        inventario.eliminarCarro(opcion);
        
    }
    /**
     *muestra todos los carros en el inventario
     */
    public void mostrarCarros(){
        inventario.obtenerDatos();
    }
}

