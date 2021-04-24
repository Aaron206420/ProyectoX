/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import SextaclaseProgramador.Compugrama;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Examen {

    public static void main(String []args) {

        String nombre = " ";
        String apellidos = " ";
        int edad = 0;
        String genero = " ";
        boolean covid19 = true;
        String antecedentes = " ";
        String covid19o = " ";
        int nuncitas = 0;
        int citas = 0;
        int mesdecita;
        int alertaedad = 0;
        int salud = 0;
        mesdecita = citas(edad);
        int primeracita;
        int nun = 0;
        int primeracitacovid;
        primeracita = primeracita(nun, nuncitas);

        if (nombre.equals("")){
        System.out.println("lista de datos basicos");
        System.out.println("1. nombre del paciente");
        System.out.println("2. apellidos del paciente");
        System.out.println("3.genero del paciente");
        System.out.println("4.edad del paciente");
        System.out.println("5.antecentes del paciente");
        System.out.println("6.reiniciar");
        }
        else{
        System.out.println("lista de datos medicos");
        System.out.println("1. nombre del paciente");
        System.out.println("2. apellidos del paciente");
        System.out.println("3.genero del paciente");
        System.out.println("4.edad del paciente");
        System.out.println("5.antecentes del paciente");
        System.out.println("6.citas para el paciente");
        System.out.println("7.reiniciar");
        }
        Scanner ded = new Scanner(System.in);
        int nuny = ded.nextInt();

        while (true) {
            switch (nuny) {

                case 1:
                    System.out.println("el nombre del paciente es: " + nombre);
                    System.out.println("los apellidos del paciente son: " + apellidos);
                    System.out.println("el genero del paciente es: " + genero);
                    System.out.println("la edad del paciente es: " + edad);
                    System.out.println("el paciente tiene Covid19?: " + covid19);
                    break;

                case 2:

                    System.out.println("1. nombre del paciente es: " + nombre);
                    System.out.println("los apellidos del paciente son: " + apellidos);
                    System.out.println("el genero del paciente es: " + genero);
                    System.out.println("la edad del paciente es: " + edad);
                    System.out.println("el paciente tiene Covid19?: " + covid19);
                    System.out.println("el paciente tiene antecendentes?: " + antecedentes);

                    break;
                case 3:

                    System.out.println("el paciente tiene antecendentes?: " + antecedentes);
                    System.out.println("si SI tiene antecentes diga su nivel de salud  " + nun + salud);

                    salud = niveldeSalud(nun);

                    break;

                case 4:

                    System.out.println("el nombre del paciente es: " + nombre);
                    System.out.println("el paciente tiene antecendentes o tuvo Covid19?: " + antecedentes);
                    System.out.println("que edad tiene el paciente? " + edad);
                    System.out.println(alertaedad);

                    alertaedad = edades(edad);

                    break;

                case 5:

                    System.out.println("menu de citas");
                    System.out.println("sus citas se van a generar en el 2021");
                    System.out.println("el paciente tuvo Covid19?: " + covid19o);
                    System.out.println("anote el numero de citas " + nuncitas);
                    System.out.println("indique su edad: " + edad);
                    System.out.println(citas);
                    System.out.println("su cita sera en el dia: " + primeracita);
                    System.out.println("la segunda cita sera en 10 días");
                    Compugrama doc = new Compugrama();
                    doc.inyeccion(8);
            }

        }

    }

    public void inyeccion(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==2){
                    System.out.print("0\t");
                } else {
                    
                    if(i==1 || i==n)
                    System.out.print("0\t");
                    else
                        if(i==(n-j))
                            System.out.print("0\t");
                        else
                            System.out.print(" \t");
                }
                
            }
            System.out.println();

        }
    }

    public static int primeracita(int nivelsalud, int citasasignadas) {

        int resultado = 0;

        resultado = nivelsalud + citasasignadas;

        return resultado;

    }

    public static int primeracita(int nivelsalud) {

        int resultado = 0;

        resultado = nivelsalud + 1;

        return resultado;

    }

    public static int niveldeSalud(int salud) {

        int resultado = 0;

        if (salud <= 1) {

            System.out.println("la persona esta pesima de salud");

        } else if (salud <= 2) {

            System.out.println("la persona esta muy mala de salud");

        } else if (salud <= 3) {

            System.out.println("la persona esta mala de salud");

        } else if (salud <= 4) {

            System.out.println("la persona esta leve de salud");

        } else if (salud <= 5) {

            System.out.println("la persona esta normal de salud");

        } else if (salud <= 6) {

            System.out.println("la persona esta mejor de salud");

        } else if (salud <= 7) {

            System.out.println("la persona esta alta de salud");

        } else if (salud <= 8) {

            System.out.println("la persona esta bien de salud");

        } else if (salud <= 9) {

            System.out.println("la persona esta muy bien de salud");

        } else {

            System.out.println("la persona esta excelente de salud");

        }
        return resultado;
    }

    public static int citas(int ages) {

        int resultado = 0;

        if (ages > 90) {

            System.out.println("la persona tiene cita en el mes de mayo");

        } else if (ages > 70) {

            System.out.println("la persona tiene cita en el mes de junio");

        } else if (ages > 50) {

            System.out.println("la persona tiene cita en el mes de julio");

        } else {

            System.out.println("la persona tiene cita en el mes de agosto");

        }
        return resultado;
    }

    public static int edades(int ages) {

        int resultado = 0;

        if (ages < 60) {

            System.out.println(" alerta ud tiene mas de 60 años ");

        }

        return resultado;

    }

    
}
