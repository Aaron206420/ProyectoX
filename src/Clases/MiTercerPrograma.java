package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class MiTercerPrograma {
    public static void main (String []args){
     int edad = 17;
     if (edad > 16){
         
         System.out.println("Entre a lo otaku....");
     }
     else if(edad > 12){
         System.out.println("Elijo a Rem");
     }
     else{
            System.out.println("Es fan del h....");
    }
     
    System.out.println("Ese wey le gusta el yuri");
    System.out.println("Awebo soy joven");
    
    int ages = 2;
    
    switch (ages){
        case 1:
            System.out.println("pos 1");
            break;
        case 9:
            System.out.println("el 2");
            break;
        case 8:
            System.out.println("y sigue el 3");
            break;
        case 3:
           System.out.println("see 4");
            break;
        case 10:
            System.out.println("y recuerda tiene 7");
    }
    String nombre = "Aron";
   
    switch (nombre){
        
        case "Jordi":
            System.out.println("case TLC");
            System.out.println("no wey");
            break;
        case "Aron":
            System.out.println("la mera verga");
    }
    int TiempoEduccionMedia = 6;
    int TiempoUniversidad = 4;
    int TiempoTrabajando = 10;
    
    int TotalTiempo;
    TotalTiempo = calcularsuma(TiempoEduccionMedia,TiempoUniversidad,TiempoTrabajando);
          System.out.println(TotalTiempo);
          
          
          
          
          
           establecerFormatoEmpresa("Texto de Prueba");
          
          
          
          
          
     }//Fin metodo main
    
    public static int calcularsuma(int paran1, int paran2, int paran3){
        int resultado;
        resultado = paran1 + paran2 + paran3;
        return resultado;
        
    }
    public int calcularSuma(int param1, int param2){
        int resultado;
        resultado = param1 + param2; 
        
        return resultado;
    }
    
    
    
    public static int calcularMultiplicacion(int pro1, int pro2){
        int resultado;
        resultado = pro1 * pro2;
        return resultado;
    }
            
public static void establecerFormatoEmpresa(String txtoAimprimir){
        String encabezado = "-----Universidad Latina-----\n";
        String pie = "-------------------------------------\n";
        
    }
}
