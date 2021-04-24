/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Aerolinea {
    public static void main (String []args){
        
        int Jhondolor =0;
        int Tatiana =0;
        double solucion;
        solucion = Calculardescuento(28000);
        System.out.println(Jhondolor+" "+solucion);
        solucion = Calculardescuento(15000);
        System.out.println(Tatiana+" "+solucion);
        
    }
    public static double Calculardescuento ( double tiquetes){
        double resultado;
        resultado = tiquetes*0.25;
       
        return resultado;
    } 
    
    public int Calcularvuelo (int vueloatrasado ){ 
    int resultado = 0;
    
    Scanner escaneo = new Scanner (System.in);
    for(int i=0;i< vueloatrasado;i++){
        int nun = escaneo.nextInt();
        if(i==0){
            System.out.println("el vuelo no esta atrasado");
        }
        else{
            System.out.println("Estimados pasajeros,les ofrecemos las disculpas por los inconvenientes");
        }
       
    }
    return resultado;
    }
}
