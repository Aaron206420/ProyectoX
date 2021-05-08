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
        
    }
    
    public Vehiculo agregarVehiculo(Vehiculo v){
        this.vehiculo = new Vehiculo[v];
        for(int i=0; i< v; i++){
            
        }
        return v;
    }
    
    public Motor agregarMotor(Motor m){
        
    }
    
    public Llanta agregarLlanta(Llanta l){
        
    }
    
    public Vehiculo vehiculoVendido(Vehiculo v){
        
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
