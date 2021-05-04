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
public class EquipoSonidoControlador {
    
    public void iniciar() {
        
    
    Scanner audio = new Scanner(System.in);

    
        while (true) {
        System.out.println("Menu");
        System.out.println("Reproducir la lista en orden");
        System.out.println("Reproducir la lista en forma aleatoria");
        System.out.println("Mostrar la lista completa");
        System.out.println("Agregar nuevo audio");
        System.out.println("Eliminar audio");
        System.out.println("Salir");
        
        int nuny = audio.nextInt();

        switch (nuny) {
            case 1:
            System.out.println(" orden del arreglo");
            arreglo = (String) audio.next();

                
                

        }
    }
    }
}
