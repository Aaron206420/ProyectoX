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
public class QuintoPrograma {
    public static void main (String []args){
        
        boolean hayCafehecho =false;
        boolean estadulce = false;
        int nivelAzucar = 0;
        
        System.out.println("Quiero Cafe");
        
        if(hayCafehecho){
            System.out.println("Calentar Cafe");
            System.out.println("Servir el cafe y añadir azucar");
        }
        else{
            System.out.println("Hacer Cafe");
        }
        
        while(!estadulce){
            System.out.println("Añadir azucar");
            nivelAzucar++;
            if(nivelAzucar==10){
                estadulce= true;
                System.out.println("Tomar Cafe");
            
            }
         
        }
        
        
        
        
        //otro tema
        
         for (int nun = 1; nun <= 100; nun++ ){
         boolean par = true;
         
            if(par){
            
             
                System.out.println("tu nivel de steam:"+ nun);
                par = false;
                
                for (int nuny = 1; nuny <= 10; nuny++){
                    System.out.println("-"+ nun);
                }
            }
            else{
                 par = true;
             
             }  
            
            
            
            
           
            
            
            
         
        }   
    }// Fin Metodo main
    
    
     public static void Cronograma (int n){
                
                
                
                
            }
            
    
    
     
        public String imprimirPie(String texto){
            
            
        String resultado = texto + "-*-*-*Menu de la Ceféteria*-*-*-";
        
        return resultado;
    }

}
