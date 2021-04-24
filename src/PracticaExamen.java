/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 * 
 */
public class PracticaExamen {
    public static void main (String []args){
        //area circulo(A = πr²)
        //area rectangulo  A = h * b
        //area cuadrado A = L²
        System.out.println("Vamos a calcular el area de un rectangulo");
        System.out.println("rectangulo: A= base*altura ");
         System.out.println("b= 6,h= 17");


        int base = 6;
        int altura = 17;
        int rectangulo;
        rectangulo = area(base,altura);
        System.out.println("El area del rectangulo es: "+rectangulo);
        
        int lado1 = 8;
        int lado2 = 8;
        int lado3 = 8;
        int lado4 = 8;
        int cuadrado;
        cuadrado = area(lado1,lado2,lado3,lado4);
        System.out.println("El area del cuadrado es: "+cuadrado);

        
        double Pi = 3.14;
        int radio1 = 6;
        int radio2 = 6;
        int radio3 = 6;
        int radio4 = 6;
        double circulo;
        circulo = area(Pi,radio1,radio2,radio3,radio4);
        System.out.println("El area del circulo es: "+circulo);

        
        
        
        
        
        //problema4 año bisiesto
        //formula: p/(q/r)
        int p = 4;
        int q = 100;
        int r = 400;    
        double añobisiesto;
        añobisiesto = calcularDivision(4,100,400);
        System.out.println("sera añobisiesto en los proximos "+añobisiesto+" años");

                
        
        //Problema5
        //Pi resultado actual = 3,3792865
        //Pi =                  3,141592654
        //Pi = 4 – (4/3) +  (4/5) – (4/7) +  (4/9) + …. + (4/101)
       
        
        
        
        
        //Problema7
        int x = 9;
        int y = 8;
        int sumaxy;
        sumaxy = calcularSuma (x,y);
        System.out.println("x+y"+"="+sumaxy);

    }
    
    public static double calcularDivision(int p, double q, double r){
        double resultado;
        resultado = p/(q/r); 
        
        return resultado;
    }
    public static int calcularSuma(int nuny1, int nuny2){
        int resultado;
        resultado = nuny1 + nuny2; 
        
        return resultado;
    }
    public static int area (int lado, int amcho){
       int resultado = 0;
       resultado= lado*amcho;
       
        return resultado;
    }
    public static int area (int lado, int lado1, int lado2, int lado4){
       int resultado = 0;
       resultado= lado+lado1+lado2+lado4;
       
        return resultado;
    }
     public static double area (double Pi, int radio1, int radio2, int radio3, int radio4){
       double resultado = 0;
       resultado= Pi*(radio1+radio2+radio3+radio4);
       
        return resultado;
    }
}
