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
    Aviso aviso = new Aviso(w, fv);

    public void iniciar() {
        while (true) {
            int menu = w.menu();
            Llanta llantas = new Llanta();
            Motor motor = new Motor();
            Vehiculo vehiculo = new Vehiculo(llantas, motor);
            switch (menu) {
                case 1:
                    w.agregarVehiculo(vehiculo);
                    fv.agregarVehiculo(vehiculo);
                    break;
                case 2:
                    w.agregarMotor(motor);
                    fv.agregarMotor(motor);
                    break;
                case 3:
                    w.agregarLlanta(llantas);
                    fv.agregarLlanta(llantas);
                    break;
                case 4:
                    aviso.imprimirListaVehiculos();
                    break;
                case 5:
                    aviso.imprimirListaMotor();
                    break;
                case 6:
                    aviso.imprimirListaLlantas();
                    break;
            }
            if (menu == 7) {
                break;
            }
        }
    }
}
