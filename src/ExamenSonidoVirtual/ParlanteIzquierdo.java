/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSonidoVirtual;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class ParlanteIzquierdo {

    public static void main(String[] args) {
        String sonarizquierdo = " ";
        int volumenizquierdo = 0;
        String habilitar = "";
        int listaaudios = 20;

        Scanner audio = new Scanner(System.in);

        while (true) {
            System.out.println("lista del Parlante Izquierdo");
            System.out.println("Sonar");
            System.out.println("Volumen");
            System.out.println("Habilar o Deshabilitar");
            System.out.println("Lista de Reproduccion de Audios");
            int nuny = audio.nextInt();

            switch (nuny) {
                case 1:
                    System.out.println("audio de musica izquierdo ");
                    sonarizquierdo = (String) audio.next();
                    break;
                case 2:
                    System.out.println("nivel de volumen ");
                    volumenizquierdo = audio.nextInt();
                    break;
                case 3:
                    System.out.println("opcion de habilitar");
                    habilitar = (String) audio.next();
                case 4:
                    System.out.println("lista de reproduccion ");
                    listaaudios = audio.nextInt();
                    break;

            }

        }
    }

}
