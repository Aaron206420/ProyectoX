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
    
    public void vehiculosBodega(){
        for(int i=0; i< 1000; i++){
            if (vehiculo[i].equals("") == false) {
                System.out.println("Vehiculos#"+i+":"+vehiculo[i]);
            }
        }
    }
   
    
    public boolean agregarVehiculo(Vehiculo v){
        boolean resultado = false;
        if(nun< 10){
            vehiculo[nun]= v;
            nun++;
            resultado = true;
        }
        return resultado;
    }
    
    public boolean agregarMotor(Motor m){
        boolean resultado = false;
        if(nun< 10){
            motor[nun]= m;
            nun++;
            resultado = true;
        }
        return resultado;
    }
    
    public boolean agregarLlanta(Llanta l){
        boolean resultado = false;
        if(nun< 10){
            llanta[nun]= l;
            nun++;
            resultado = true;
        }
        return resultado;
    }
    
    public void vehiculoVendido(boolean estado){
        
        
    }
    
    public void establecerEstado(Vehiculo v, int estado){
        
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
