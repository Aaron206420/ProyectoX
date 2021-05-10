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
public class FabricaVehiculos {

    Vehiculo vehiculo[];
    Motor motor[];
    Llanta llanta[];
    int nun;

    FabricaVehiculos() {

    }

    public void vehiculosBodega() {
        for (int i = 0; i < 1000; i++) {
            if (vehiculo[i].equals("") == false) {
                System.out.println("Vehiculos#" + i + ":" + vehiculo[i]);
            }
        }
    }

    public boolean agregarVehiculo( ) {
        Vehiculo v = null;
        boolean resultado = false;
        if (nun < 10) {
            vehiculo[nun] = v;
            nun++;
            resultado = true;
        }
        return resultado;
    }

    public boolean agregarMotor( ) {
        Motor m = null;
        boolean resultado = false;
        if (nun < 10) {
            motor[nun] = m;
            nun++;
            resultado = true;
        }
        return resultado;
    }

    public boolean agregarLlanta() {
        Llanta l = null;
        boolean resultado = false;
        if (nun < 10) {
            llanta[nun] = l;
            nun++;
            resultado = true;
        }
        return resultado;
    }

    public boolean vehiculoVendido( ) {
        boolean resultado = false;
        if (nun != 0) {
            nun--;
            vehiculo[nun - 1] = null;;
            resultado = true;
        }
        return resultado;
    }

    public void establecerEstado( ) {
        for(int i=0;i<nun; i++){
            if(vehiculo[i]!=null)
            System.out.println(vehiculo[i].getVendido());
            System.out.println(vehiculo[i].toString());
        }

    }

    public FabricaVehiculos(Vehiculo[] vehiculo, Motor[] motor, Llanta[] llanta) {
        this.vehiculo = vehiculo;
        this.motor = motor;
        this.llanta = llanta;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Motor[] getMotor() {
        return motor;
    }

    public void setMotor(Motor[] motor) {
        this.motor = motor;
    }

    public Llanta[] getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

}
