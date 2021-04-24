package Programaoclase8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class OctavoPrograma {
    public static void main (String []args){
        //byte edad = 124;
        //int sumatoria = 273;
        
        //sumatoria = edad
        //edad = (byte)sumatoria;
        //System.out.println(edad);
        
        //ejemplo 2
        int edad1 = 28;
        int age = 2021;
        int nivelsalud = 15;
        totalnun((byte)edad1, (short)age, (byte)nivelsalud);
        
        
        //ejemplo3
        int nun= 1000;
        long max= nun;
        nun = (int)max;
        
        float precio1 = 19000;
        float precio2 = 23000;
        double pagototal = precio1 + precio2;
        precio1 = (float)pagototal;
        
        //ejemplo4
        double total = 765.524;
        int nuny = (int)total;
        System.out.println("Numero sin decimales es: "+nuny);
    }
    public static void totalnun(byte persona, short ages, byte nivel){
        
        if(nivel<10){
            System.out.println(persona + ages);
        }
        
    }
    
  
}
