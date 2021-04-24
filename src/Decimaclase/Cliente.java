/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decimaclase;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Cliente {
    String nombre = "";
    String apellidos = "";
    String nunCedula = "";
    int nunvuelo = 0;
    String nacionalidad = "";
    
    public void solicitarDatos(){
        Scanner aron = new Scanner(System.in);
        System.out.println("Favor digite su nombre: ");
        this.nombre = aron.next();
        
    }
    
    @Override
    public String toString (){
        return  "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numCedula=" + nunCedula + ", numVuelo=" + nunvuelo + ", nacionalidad=" + nacionalidad + '}';
    }
    public String getNombre(){
        return  nombre;
    }
    public void  setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumCedula() {
        return nunCedula;
    }

    public void setNumCedula(String nunCedula) {
        this.nunCedula = nunCedula;
    }

    public int getNumVuelo() {
        return nunvuelo;
    }

    public void setNumVuelo(int nunvuelo) {
        this.nunvuelo = nunvuelo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
