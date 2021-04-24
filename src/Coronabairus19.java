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
public class Coronabairus19 {

    public static void main(String[] args) {
        Scanner spinner = new Scanner(System.in);
        String nombre = "";
        String apellidos = "";
        String genero = "";
        int age = 0;
        boolean antecendentes = true;
        String sangre = "";
        String covid = "";
        
        if (nombre.equals("")){
            System.out.println("Lista de opciones");
            System.out.println("1. Digitar datos basicos");
            System.out.println("3. Info del paciente");
            System.out.println("4. Enfermedad Grave");
            System.out.println("5. Reiniciar");
        } 
        else {
            System.out.println("Lista de opciones");
            System.out.println("1. Digitar datos basicos");
            System.out.println("2. Datos Medicos");
            System.out.println("3. Info del paciente");
            System.out.println("4. Enfermedad Grave");
            System.out.println("5. Reiniciar");
        }
        System.out.println("Elija menu de opciones");
        int menu = spinner.nextInt();

        while (true) {

            switch (menu) {
                case 1:

                    System.out.println("Nombre del paciente:");
                    nombre = spinner.nextLine();
                    System.out.println("Apellidos del paciente");
                    apellidos = spinner.nextLine();
                    System.out.println("Edad del paciente:");
                    age = spinner.nextInt();
                    System.out.println("Genero del paciente:");
                    genero = spinner.nextLine();
                    break;
                case 2:
                    System.out.println("A tenido antecedentes de alguna enfermedad antes?");
                    antecendentes = spinner.nextBoolean();
                    System.out.println("tipo de sangre?");
                    sangre = spinner.nextLine();
                    System.out.println("Tiene Covid-19?");
                    covid = spinner.nextLine();
                {
                    boolean antecedentes = true;
                    alertas (age, antecedentes);
                }
                    alertas (sangre);
                    break;

                case 3:
                    System.out.println("Nombre completo del paciente:" + nombre);
                    System.out.println("Edad del paciente:" + age);
                    System.out.println("Genero del paciente" + genero);
                    System.out.println("El tipo de sangre es:" + sangre);
                    System.out.println("El paciente tiene Covid?" + covid);
                    break;
                case 4:
                    double probabilidad = age * 0.9;
                    System.out.println("probabilidad de estar muy grave" + probabilidad);
                    break;
                case 5:
                    nombre = "";
                    apellidos = "";
                    genero = "";
                    age = 0;
                    antecendentes = true;
                    sangre = "";
                    covid = "";

            }

        }

    }

    public static void alertas(int age, boolean antecedentes) {

        if (age > 60 || antecedentes == true){
            System.out.println("El paciente es factor de riesgo");
        }
    }
    public static void alertas (String sangre){
        if (sangre == "0+"){
            System.out.println("El paciente es factor de riesgo");

        }
    }
}
