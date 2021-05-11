/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenExtraordinario;

/**
 *
 * @author Aaron
 */
public class Aviso {
    VehiculosVista w;
    FabricaVehiculos fv;
    
    public Aviso( VehiculosVista vista, FabricaVehiculos sistema) {
        this.w = w;
        this.fv = sistema;
    }
    public void imprimirListaVehiculos(){
        String ListaVehiculos = "";
        for(int i = 0; i < fv.nun; i++){
          ListaVehiculos += "El inventario de vehiculos: ";
          ListaVehiculos += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaVehiculos);
    }
    public void imprimirListaLlantas(){
        String ListaLlantas = "";
        for(int i = 0; i < fv.nuny; i++){
          ListaLlantas += "El inventario de vehiculos: ";
          ListaLlantas += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaLlantas);
}
    public void imprimirListaMotor(){
        String ListaMotor = "";
        for(int i = 0; i < fv.nunny; i++){
          ListaMotor += "El inventario de vehiculos: ";
          ListaMotor += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaMotor);
	}
}
