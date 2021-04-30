/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Claseprogra13;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Vista {
    Modelo modelo;
    
    public Vista(Modelo mm) {
        this.modelo = mm;
    }
    
    public int mostrarMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Menu\n1 Introducir dos numeros\n 2 Sumar"
                + "\n3 Restar \n4 Mostrar resultado");
        
        int opcionSeleccionada = s.nextInt();
        
        return opcionSeleccionada;
    }
    
    public void mostrarResultado(int resutado){
        System.out.println(resutado);
    }
    
    public void soliciteDosNumeros(){
        Scanner s = new Scanner(System.in);
        this.modelo.setNun1(s.nextInt());
        this.modelo.setNun2(s.nextInt());
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
