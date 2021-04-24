package Extraclase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Extraclase1 {
    public static void main (String []args){
        
        double solucion = 0;
        solucion = calcularImpuesto(0,329000);
        System.out.println("Jessica Mendez"+" "+solucion);
        solucion = calcularImpuesto(3,560000);
        System.out.println("Eduardo delRey"+" "+solucion);
        solucion = calcularImpuesto(1,690000);
        System.out.println("Emily Leide"+" "+solucion);
        solucion = calcularImpuesto(4,832000);
        System.out.println("Nancy Callajan"+" "+solucion);
        solucion = calcularImpuesto(2,740000);
        System.out.println("Henry Mendoza"+" "+solucion);
        
       
    }
    public static double calcularImpuesto(int numDependientes, double salario){
        double resultado = 0;
        if (salario < 200000){
        
            resultado = (salario*0);
        }
        else if (salario < 400000){
            
            resultado = (salario*0.1);
        }
        else if (salario < 600000){
            
            resultado = (salario*0.15);
        }
        else if (salario < 800000){
            
            resultado = (salario*0.2);
        }
        else{
            
            resultado = (salario*0.3);
        }
        
        int persona = numDependientes;
        double resultado1 = 0;
        if (numDependientes == 1){
            
             resultado1= (resultado*1);
        }
        else if (numDependientes == 2){
            
            resultado1 = (resultado*0.9);
        }
        else if (numDependientes == 3){
            
            resultado1 = (resultado*0.7);
        }
        else if (numDependientes == 4){
            
            resultado1 = (resultado*0.6);
        }
        else{
            
            resultado1 = (resultado*0.4);
        }
        
        return resultado1; 
    }
}

