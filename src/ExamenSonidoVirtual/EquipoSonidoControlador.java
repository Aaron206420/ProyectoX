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

    EquipoSonido es = new EquipoSonido();
    EquipoSonidoVista esv = new EquipoSonidoVista(es);

    public void iniciar() {
        while (true) {

            int option = esv.mostrarMenu();
            
            switch (option) {
                case 1:{
                    es.listaOrdenada();
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    es.listaCompleta();
                    break;
                }
                case 4:{
                    System.out.println("Ingresar audio: ");
                    Scanner a = new Scanner(System.in);
                    String nuevoAudio = a.next();
                    es.agregarlistaAudio(nuevoAudio);
                    System.out.println(" ");
                    break;
                }
                case 5:{
                    es.eliminarlistaAudio();
                     break;
                }
            }
        }
    }
}
