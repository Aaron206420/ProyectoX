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
    public void imprimirListaLlanta1(){
        String ListaLlanta1 = "";
        for(int i = 0; i < fv.nuny; i++){
          ListaLlanta1 += "El inventario de vehiculos: ";
          ListaLlanta1 += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaLlanta1);
    }
    public void imprimirListaLlanta2(){
        String ListaLlanta2 = "";
        for(int i = 0; i < fv.nuny; i++){
          ListaLlanta2 += "El inventario de vehiculos: ";
          ListaLlanta2 += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaLlanta2);
    }
    public void imprimirListaLlanta3(){
        String ListaLlanta3 = "";
        for(int i = 0; i < fv.nuny; i++){
          ListaLlanta3 += "El inventario de vehiculos: ";
          ListaLlanta3 += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaLlanta3);
    }
    public void imprimirListaLlanta4(){
        String ListaLlanta4 = "";
        for(int i = 0; i < fv.nuny; i++){
          ListaLlanta4 += "El inventario de vehiculos: ";
          ListaLlanta4 += fv.getVehiculo()[i].toString();
        }
       w.imprimirAviso(ListaLlanta4);
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
