/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenExtraordinario;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class VehiculosVista {

    VehiculosVista(FabricaVehiculos fv) {
        
    }
    
    public int mostrarMenuVehiculo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu del pidido\n Color del Vehiculo \n Marca del Vehiculo"
                + "\nModelo del Vehiculo \nAño de Frafricación \n Salir");
        int menu = s.nextInt();
        
        return menu;
    }
    
    public int mostrarMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu\n Lista de Vehiculos en Bodega \n Lista de Vehiculos Vendidos"
                + "\nLista de Vehiculos Devueltos \nAgregar Vehiculo" + "\n Establecer Estado del Vehiculo \n Salir");
        int menu = s.nextInt();
        
        return menu;
    }
}
