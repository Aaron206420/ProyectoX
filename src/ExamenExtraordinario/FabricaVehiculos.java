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

    Vehiculo[] vehiculo;
    Motor[] motor;
    Llanta[] llanta;
    int max;
    int nun;
    int nuny;
    int nunny;

    public FabricaVehiculos() {
        max = 1000;
        vehiculo = new Vehiculo[max];
        nun = 0;
        nuny = 0;
        nunny = 0;
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

    public Llanta[] getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

    public void setPartes(Motor[] motor) {
        this.motor = motor;
    }

    public boolean agregarVehiculo(Vehiculo v) {
        boolean resultado = false;
        if (nun < max) {
            vehiculo[nun] = v;
            nun++;
            resultado = true;
        }
        return resultado;
    }
        public boolean agregarMotor(Motor m) {
        boolean resultado = false;
        if (nuny < max) {
            motor[nuny] = m;
            nuny++;
            resultado = true;
        }
        return resultado;
    }
    
    
    public boolean agregarLlanta(Llanta l) {
        boolean resultado = false;
        if (nunny < max) {
            llanta[nunny] = l;
            nunny++;
            resultado = true;
        }
        return resultado;
    }

}
