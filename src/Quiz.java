/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Quiz {

    public static void main(String[] args) {

        double solucion;
        solucion = calcularAguinaldo(3, 325000, 2);
        System.out.println("Nacho Miranda" + " " + solucion);

        solucion = calcularAguinaldo(5, 567000, 5);
        System.out.println("Alberto King" + " " + solucion);

        solucion = calcularAguinaldo(7, 691000, 8);
        System.out.println("Saiko Leide" + " " + solucion);

    }

    public static double calcularAguinaldo(int meses, double salario) {
        double resultado;

        if (meses == 12) {

            resultado = (salario);
        } else {

            resultado = (meses / 12 * salario);
        }

        return resultado;
    }

    public static double calcularAguinaldo(int meses, double salario, int amonestaciones) {

        double resultado;

        if (meses == 12) {

            resultado = (salario);
            if (amonestaciones > 2) {
                resultado = 0;
            } 
            else if( amonestaciones == 1){
                
                resultado = (salario * 0.7);
            }

        } 
        else {
            resultado = (meses / 12 * salario);

            resultado = (salario);
            if (amonestaciones > 2) {
                resultado = 0;
            } 
            else if (amonestaciones == 1){
                
                resultado = (salario * 0.7);
            }

        }

        return resultado;

    }

}
