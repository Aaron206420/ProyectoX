/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraclase;

/**
 *
 * @author Aaron
 */
public class Extraclase {
    public static void main (String []args){
        
        double solucion = 0;
        solucion = calcularImpuesto(752000);
        System.out.println("Juan Perez"+" "+ solucion);
        
        solucion = calcularImpuesto(340000);
        System.out.println("Maria Vasquez"+" "+ solucion);
        
        solucion = calcularImpuesto(680000);
        System.out.println("Luis Monge"+" "+ solucion);
        
        solucion = calcularImpuesto(1500000);
        System.out.println("Carlos Hernandez"+" "+ solucion);
        
        solucion = calcularImpuesto(1000000);
        System.out.println("Erika Esquivel"+" "+ solucion);
    }
        
    public static double calcularImpuesto(double salario){
        double resultado = 0;
        if (salario >50000){
         
            resultado = ( salario*0.2);
           
        }
        
        else{ 
            
          resultado = salario*0.1;
        }
        
        
        
        return resultado;
        
    }

        
}