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
public class ParlandeDerecho {

    public static void main(String[] args) {
        String sonarderecho = " ";
        int volumenderecho = 0;

        Scanner audio = new Scanner(System.in);
        

        while (true) {
            System.out.println("lista del ParlanteDerecho");
            System.out.println("Sonar");
            System.out.println("Volumen");
            System.out.println("Habilar o Deshabilitar");
            System.out.println("Lista de Reproduccion de Audios");
            int nuny = audio.nextInt();

            switch (nuny) {
                case 1: 
                    System.out.println("audio de musica derecho " + sonarderecho);
                    break;
                case 2: 
                    System.out.println("nivel de volumen " + volumenderecho);
                    break;
                case 3:
                    
                    

                    
                
            }

        }
    }
}
