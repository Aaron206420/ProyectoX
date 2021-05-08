/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSonidoVirtual;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class EquipoSonidoVista {
    
    private EquipoSonido es;

    public EquipoSonidoVista(EquipoSonido es) {
        this.es = es;
    }
    
    public int mostrarMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu\n Reproducir la lista en orden \n Reproducir la lista en forma aleatoria"
                + "\nMostrar la lista completa \nAgregar nuevo audio" + "\n Eliminar audio \n Salir");
        int menuAudio = s.nextInt();
        
        return menuAudio;
    }
}
