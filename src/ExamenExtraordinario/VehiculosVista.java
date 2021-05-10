/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenExtraordinario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class VehiculosVista {
    boolean analisis = true;
    VehiculosVista(FabricaVehiculos fv) {
        
    }
    
    public int mostrarMenu() {
        Scanner s = new Scanner(System.in);
        String msj = "Menu\n Lista de Vehiculos en Bodega \n Lista de Vehiculos Vendidos"
                + "\nLista de Vehiculos Devueltos \nAgregar Vehiculo" + "\n Establecer Estado del Vehiculo \n Salir";

        int opcionAceptada;
        if (analisis) {
            opcionAceptada = Integer.parseInt(JOptionPane.showInputDialog(null, msj));
        } else {
            System.out.println(msj);
        }

        opcionAceptada = s.nextInt();

        return opcionAceptada;
    }
    
    public int mostrarMenuVehiculo() {
        Scanner s = new Scanner(System.in);
        String msj =  "Menu del pidido\n Color del Vehiculo \n Marca del Vehiculo"
                + "\nModelo del Vehiculo \nAño de Frafricación \n Salir";

        int opcionAceptada;
        if (analisis) {
            opcionAceptada = Integer.parseInt(JOptionPane.showInputDialog(null, msj));
        } else {
            System.out.println(msj);
        }

        opcionAceptada = s.nextInt();

        return opcionAceptada;
    }
    public void mostrarmensaje(String ms) {
        if (analisis) 
            JOptionPane.showMessageDialog(null, ms);
        else 
            System.out.println(ms);
        

    }
    
    void soliciteDatosExamen(FabricaVehiculos six) {
        String estadoVehiculo = "";
        if (analisis) {
            estadoVehiculo = JOptionPane.showInputDialog(null, "Digite la marca de carro");
            
        }
        else{
            Scanner cb = new Scanner(System.in);
            System.out.println("Estado de Vehiculos");
            cb.nextInt();
           
        }
    }
}
       
