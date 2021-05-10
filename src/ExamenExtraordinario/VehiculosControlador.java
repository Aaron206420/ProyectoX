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
public class VehiculosControlador {
    FabricaVehiculos fv = new FabricaVehiculos();
    VehiculosVista w = new VehiculosVista(fv);
    


    public void iniciar() {
        while (true) {

            int option = w.mostrarMenu();
            
            switch (option) {
                case 1:{
                    fv.vehiculosBodega();
                    break;
                }
                case 2:{
                    fv.agregarVehiculo();
                    
                    break;
                }
                case 3:{
                    fv.agregarMotor();
                    
                    break;
                }
                case 4:{
                    fv.agregarLlanta();
                    
                    break;
                }
                case 5:{
                    fv.vehiculoVendido();
                    break;
                }
                case 6:{
                    fv.establecerEstado();
                    
                    break;
                }
                   
            }
        }
    }
}
