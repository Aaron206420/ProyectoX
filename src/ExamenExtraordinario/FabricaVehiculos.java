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

    FabricaVehiculos() {
        
    }
    
    public void vehiculosBodega(){
        for(int i=0; i< 1000; i++){
            if (vehiculo[i].equals("") == false) {
                System.out.println("Vehiculos#"+i+":"+vehiculo[i]);
            }
        }
    }
    
    public Vehiculo agregarVehiculo(Vehiculo v){
        
        return v;
    }
    
    public Motor agregarMotor(Motor m){
        return m;
    }
    
    public Llanta agregarLlanta(Llanta l){
        return l;
    }
    
    public Vehiculo vehiculoVendido(Vehiculo v){
        return v;
    }
    
    public Vehiculo establecerEstado(Vehiculo v, int estado){
        
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
