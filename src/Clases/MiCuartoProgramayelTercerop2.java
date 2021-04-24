package Clases;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class MiCuartoProgramayelTercerop2 {
    public static void main (String []args){
        
        boolean maldia = true;
        
        if(maldia==false){
            System.out.println("jajajjajaj idiota");
        }
        else{
            System.out.println("cabron xd");
        }
      
        
        int  numero = 1;
        if (numero == 1){
            System.out.println("");
        }
        if (numero != -1){
            System.out.println("");
        }
        if (numero <=1){
            System.out.println("");
        }
        if (-1 != numero){
            System.out.println("");
        }
        if (numero < -1){
            System.out.println("");
        }
        
        boolean QuizdeProgra = true;
        if (!QuizdeProgra){
            System.out.println("hay que practicar mucho");
        }
        else {
            System.out.println("igual toca practicar");
        }
        
        boolean profe = true;
        boolean internet = true;
        boolean luz = true;
        boolean terremoto = false;
        
       //PRIMERA FORMA
        if (profe == true){
            if (internet == true){
                if (luz == true){
                    if (terremoto == false){
                        System.out.println("SI HAY QUIZ");
                    }
                    else {
                        System.out.println("NO HAY QUIZ");
                    }
                }
                else {
                    System.out.println("NO HAY QUIZ");
                }
            }
            else {
                System.out.println("NO HAY QUIZ");
            }
        }
        else {
            System.out.println("NO HAY QUIZ");
        }
        
        //Segunda Forma
        String mensaje = "NO HAY QUIZ";
        if (profe == true){
            if (internet == true){
                if (luz == true){
                    if (terremoto == false){
                        mensaje = "SI HAY QUIZ";
                    }
                }
            }
        }
        System.out.println(mensaje);
        
        //tercera Forma
         mensaje = "NO HAY QUIZ";
        if (profe){
            if (internet){
                if (luz){
                    if (!terremoto){
                        mensaje = "SI HAY QUIZ";
                    }
                }
            }
        }
        System.out.println(mensaje);
        
        //cuarta Forma
         mensaje = "NO HAY QUIZ";
        if (luz){
            if (!terremoto){
                if (profe){
                    if (internet){
                        mensaje = "SI HAY QUIZ";
                    }
                }
            }
        }
        System.out.println(mensaje);
        
        //quinta forma
        if (profe && internet && luz && terremoto){
            System.out.println("SI HAY QUIZ");
        }
        else {
            System.out.println("NO HAY QUIZ");
        }
        
        //sexta forma
        mensaje = "NO HAY QUIZ";
        if (profe && internet && luz && terremoto){
            mensaje = "SI HAY QUIZ";
        }
        System.out.println(mensaje);
        
        //septima forma
        mensaje = "NO HAY QUIZ";
        if (profe && internet && luz && terremoto){
            mensaje = "SI HAY QUIZ";
        }
        System.out.println(mensaje);
       
        
        //Alcance Variable
        
        if (internet){
            int QUIZ = 1;
            if (luz){
                System.out.println("El #quiz es"+ QUIZ);
            }
            
        } 
        
        
        //Aritmetrica
      int quiz  = 1;
      
        //aumenta uno
        quiz = quiz + 1;
        quiz++;
        
        //aumenta dos en dos
        quiz = quiz + 2;
        quiz += 2;
        
        System.out.println(quiz);
        
        quiz = quiz - 2;
        quiz -= 2;
        
        quiz = quiz * 2;
        quiz *= 2;
        
        quiz = quiz / 2;
        quiz /= 2;
        
        quiz = quiz % 2;
        quiz %= 2;
        
        //Ciclos
        
        //primera forma
        System.out.println("El numero"+1);
        System.out.println("El numero"+2);
        System.out.println("El numero"+3);
        
        //segunda forma
        int nun = 1;
        System.out.println("El numero"+ nun);
        nun = nun + 1;
        System.out.println("El numero"+ nun);
        nun = nun + 1;
        System.out.println("El numero"+ nun);
        
        //tercera forma
        
        nun = 1;
        System.out.println("El numero"+ nun);
        nun++;
        System.out.println("El numero"+ nun);
        nun++;
        System.out.println("El numero"+ nun);
        
        //Ciclos con el metodo For y While
        
        //primera forma
        for(int nuny = 1; nuny<= 1000; nuny++){
            
            System.out.println("EL numero"+ nuny);
            
        }
        
        //segunda forma
        int nunny = 1;
        while (nunny <= 1000){
            System.out.println("EL numero"+ nunny);
            
        nunny++;
        }
        
        
        
        
        
        
        
        
        
    }
    
        
        
      
        public static void scanner () {
        
    Scanner ToF  = new Scanner(System.in);
    
    boolean profe = ToF.nextBoolean();
        boolean internet = ToF.nextBoolean();
        boolean luz = ToF.nextBoolean();
        boolean terremoto = ToF.nextBoolean();
        
       //PRIMERA FORMA
        if (profe == true){
            if (internet == true){
                if (luz == true){
                    if (terremoto == false){
                        System.out.println("SI HAY QUIZ");
                    }
                    else {
                        System.out.println("NO HAY QUIZ");
                    }
                }
                else {
                    System.out.println("NO HAY QUIZ");
                }
            }
            else {
                System.out.println("NO HAY QUIZ");
            }
        }
        else {
            System.out.println("NO HAY QUIZ");
        }
        
        //Segunda Forma
        String mensaje = "NO HAY QUIZ";
        if (profe == true){
            if (internet == true){
                if (luz == true){
                    if (terremoto == false){
                        mensaje = "SI HAY QUIZ";
                    }
                }
            }
        }
        System.out.println(mensaje);
        
        //tercera Forma
         mensaje = "NO HAY QUIZ";
        if (profe){
            if (internet){
                if (luz){
                    if (!terremoto){
                        mensaje = "SI HAY QUIZ";
                    }
                }
            }
        }
        System.out.println(mensaje);
        
        //cuarta Forma
         mensaje = "NO HAY QUIZ";
        if (luz){
            if (!terremoto){
                if (profe){
                    if (internet){
                        mensaje = "SI HAY QUIZ";
                    }
                }
            }
        }
        System.out.println(mensaje);
        }
        
    public void Escaneado(){
        //Scanner
        int Persona1;
        int Persona2;
        Scanner redScanner = new Scanner(System.in);
        
        System.out.println("Cague");
        
        Persona1 = redScanner.nextInt();
        
        System.out.println("Cagaste");
        
        Persona2 = redScanner.nextInt();
        
        System.out.println("Cotesto"+(Persona1+Persona2));
    }
    
    
}
