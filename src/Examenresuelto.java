/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Examenresuelto {
    public static void main(String[] args){
        int CANT_ASTERISCOS=7;
        String nombre=" ";
        String apellidos=" ";
        int edad=0;
        String sexo= "M"; 
        boolean indAntecedentes=false;
        boolean indCovid=false;
        int nivelSalud=0; 
        
       
        int contPersCitas=0;
        int contPersCovid=0;
        
        Scanner escaner = new Scanner(System.in);
        
        while(true){
        System.out.println("lista de datos basicos");
        System.out.println("1. nombre del paciente");
        System.out.println("2. apellidos del paciente");
        System.out.println("3.genero del paciente");
        System.out.println("4.edad del paciente");
        System.out.println("5.antecentes del paciente");
        System.out.println("6.reiniciar");
            int opcion = escaner.nextInt();
            
            switch(opcion){
            
                case 1:{
                    System.out.println("Digite el nombre");
                    nombre = (String) escaner.next();
                    System.out.println("Digite el apellido");
                    apellidos = (String) escaner.next();
                    System.out.println("Digite la edad");
                    edad = escaner.nextInt();
                    System.out.println("Digite M Mujer o H Hombre");
                    sexo = (String) escaner.next();
                    System.out.println("Tiene COVID?");
                    indCovid = escaner.nextBoolean();
                    if(indCovid)
                        contPersCovid++;

                    System.out.println("Tiene antecedentes?");
                    indAntecedentes = escaner.nextBoolean();
                    System.out.println("Digite el nivel de salud (# del 1-10)");
                    nivelSalud = escaner.nextInt();
                    break;
                }
                case 2:{
                    if(!nombre.equals("")){
                        System.out.println("Datos de la persona: "
                                +"\n "+nombre
                                +"\n "+apellidos
                                +"\n "+edad
                                +"\n "+sexo             
                                +"\n "+indCovid 
                                +"\n "+nivelSalud 
                        );

                        if(edad>60 || indAntecedentes || indCovid){
                            System.out.println("ALERTA!");
                        }
                    }
                    else
                        System.out.println("Debe ingresar los datos de la persona.");
                    break;
                }
                case 3:{
                    registrarCita(edad,nivelSalud,contPersCitas,indCovid);
                    contPersCitas++;
                    break;
                }
                case 4:{
                    nombre="";
                    apellidos="";
                    edad=0;
                    sexo="M"; 
                    indAntecedentes=false;
                    indCovid=false;
                    nivelSalud=0; 
                    break;
                } 
                case 5:{
                    
                    for(int i=0;i<CANT_ASTERISCOS;i++){
                        System.out.print("*\t");
                    }
                    System.out.println();
                    
                    for(int i=0;i<CANT_ASTERISCOS;i++){
                        System.out.print("*\t");
                    }
                    System.out.println();
                    
                    for(int i=0;i<CANT_ASTERISCOS;i++){
                        for(int j=0;j<CANT_ASTERISCOS;j++){
                            if(i==j)
                                System.out.print("*\t");
                            else{
                                System.out.print(" \t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
            }
        
        }
        
    }
    
   
    public static void registrarCita(int edad, int nivelSalud, int contPersCitas){
        String mes = "";
        if(edad>90){
            mes = "mayo";
        }
        else if(edad>70){
            mes = "junio";
        }
        else if(edad>50){
            mes = "julio";
        }
        else{
            mes = "agosto";
        }

        int dia = nivelSalud + contPersCitas;
        System.out.println("Su primera cita es " + dia + " " + mes + "2021");
        System.out.println("Su segunda cita es " + (dia+10) + " " + mes + "2021");
    }
    
   
    public static void registrarCita(int edad, int nivelSalud, int contPersCitas, boolean indCovid){
        String mes = "";
        if(edad>90){
            mes = "mayo";
        }
        else if(edad>70){
            mes = "junio";
        }
        else if(edad>50){
            mes = "julio";
        }
        else{
            mes = "agosto";
        }
        
        int dia;
        if(indCovid){
            dia = nivelSalud + 1;
        }
        else{
            dia = nivelSalud + contPersCitas;
        }
        System.out.println("Su primera cita es " + dia + " " + mes + "2021");
        System.out.println("Su segunda cita es " + (dia+10) + " " + mes + "2021");
    }
}

