/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovenaClaseprogramador;

/**
 *
 * @author Aaron
 */
public class Repaso {

    public int malasuma(int nun1, int nun2) {
        int resultado = 0;
        if (nun1 == 0) {
            return -1;
        }

        if (nun2 == 0) {
            return -1;
        }

        if (nun1 > 100) {
            resultado = nun1 + nun2;

        }
        return resultado;
    }

    public int sumarSinExcepciones(int nun1, int nun2) {
        int resultado = 0;
        if (nun1 != 0 && nun2 != 0) {
            if (nun1 > 100) {
                resultado = nun1 + nun2;
            }
        } else {
            resultado = -1;
        }
        return resultado;
    }

    public int sumarconExcepciones(int nun1, int nun2) {
        int resultado = 0;

        if (nun1 == 0 || nun2 == 0) {
            throw new IllegalArgumentException(
                    "El numero 1 y numero 2 no deben ser ceros");
        }

        if (nun1 > 100) {
            resultado = nun1 + nun2;
        }

        return resultado;
    }
}
