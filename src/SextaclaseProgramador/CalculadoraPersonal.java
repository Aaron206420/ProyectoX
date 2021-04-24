package SextaclaseProgramador;

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
public class CalculadoraPersonal {

    public int mayorNun(int buscarDelta) {
        int resultado = 0;
        String Usuario = "";

        Scanner ScannerX = new Scanner(System.in);
        int mayorNun = 0;
        int promedio = 0;

        int solucion = 0;
        for (int i = buscarDelta; i>0; i--) {
            solucion++;
            System.out.println("Digitar numero");
            int nuny = ScannerX.nextInt();
            promedio += nuny;
            if (i == 0) {
                mayorNun = nuny;
            } else {
                if (nuny > mayorNun);
                nuny = mayorNun;
            }

            Usuario += ("|" + nuny);
        }
        resultado = mayorNun;
        System.out.println("el promedio es;"+(promedio/buscarDelta));
        System.out.println(Usuario);
        return resultado;

    }
    public void invertirListanun (int buscarDelta){
      Scanner ScannerX = new Scanner(System.in);
      String listaInvertida = "";
      String listaNormal = "";
      
      for (int i = buscarDelta; i>0; i--) {
      System.out.println("Digitar numero");
      int nuny = ScannerX.nextInt();
      listaNormal += "|"+nuny;
      listaInvertida = nuny + "|"+listaInvertida;
      }
      System.out.println("Lista Normal"+listaNormal);
      System.out.println("Lista Invertida"+ listaInvertida);

    }
    public int factorizar(int nun){
        int resultado = 1;
        if (nun!=1){
            for(int i=nun; i>=1;  i--){
                resultado = resultado*i;
            }
        }
        return resultado;
    }
}
