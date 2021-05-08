/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoSonido3;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class ControladorEquipoSonido3 {
    public void iniciar(){
       System.out.println("Iniciando Equipo de Sonido");
        EquipoSonido3 es3 = new EquipoSonido3();
        Scanner inicio = new Scanner(System.in);

        boolean option = true;

        while (option) {
            System.out.println("Por Favor Seleccione una de las siguientes opciones");
            System.out.println("a: Reproducir la lista en orden.");
            System.out.println("b: Reproducir lista aleatorea.");
            System.out.println("c: Mostrar Lista Completa.");
            System.out.println("d: Agregar un nuevo audio.");
            System.out.println("e: Eliminar Audio.");
            System.out.println("f: Encender Radio.");
            System.out.println("g: Subir Volumen.");
            System.out.println("h: Bajar Volumne.");
            System.out.println("i: Prender Parlante.");
            System.out.println("j: Apagar Parlante.");
            System.out.println("k: Salir.");

            String opcionMenu = inicio.next();
            switch (opcionMenu) {
                case "a":
                    es3.setRadio64(false);
                    es3.setRandom(false);
                    es3.playRadio64();
                    break;
                case "b":
                    es3.setRadio64(false);
                    es3.setRandom(true);
                    es3.playRadio64();
                    break;
                case "c":
                    es3.audioPlaylist();
                    break;
                case "d":
                    System.out.println("Indique el audio en formato binario ej:10101");
                    String audio = inicio.next();
                    es3.agregarAudio(audio);
                    break;
                case "e":
                    System.out.println("Indique la posicion del audio, si no la conoce digite -1 e ingrese la opcion c, para ver la lista");
                    int posicion = inicio.nextInt();
                    es3.borrarAudio(posicion);
                    break;
                case "f":
                    es3.setRadio64(true);
                    es3.playRadio64();
                    break;
                case "g":
                    System.out.println("Indique L, para subir los laterales");
                    System.out.println("Indique S, para subir los Subwoofer");
                    System.out.println("Indique un numero del 0 al 10, para subirl el volumen en los 3");
                    String volumen = inicio.next();
                    volumen = volumen.toLowerCase();
                    switch (volumen) {
                        case "l":
                            es3.subirVolumenLados();
                            break;
                        case "s":
                            es3.subirVolumenGraves();
                            break;
                        default:
                            try {
                                int vol = Integer.parseInt(volumen);
                                es3.ajustarVolumen(vol);
                            } catch (NumberFormatException e) {
                                System.out.println("Error al ingresar datos");
                            }
                    }
                    break;
                case "h":
                    System.out.println("Indique L, para bajar los laterales");
                    System.out.println("Indique S, para bajar los Subwoofer");
                    System.out.println("Indique un numero del 0 al 10, para subirl el volumen en los 3");
                    String volumenDown = inicio.next();
                    volumenDown = volumenDown.toLowerCase();
                    switch (volumenDown) {
                        case "l":
                            es3.bajarVolumenLados();
                            break;
                        case "s":
                            es3.bajarVolumenGraves();
                            break;
                        default:
                            try {
                                int vol = Integer.parseInt(volumenDown);
                                es3.ajustarVolumen(vol);
                            } catch (NumberFormatException e) {
                                System.out.println("Error al ingresar datos");
                            }
                    }
                    break;
                case "i":
                    System.out.println("Indique D para prender el derecho, I para prender el Izquierdo, S para prender el Subwoofer");
                    String prende = inicio.next();
                    prende = prende.toLowerCase();
                    switch (prende) {
                        case "d":
                            es3.deshabilitarParlante(0, false);
                            break;
                        case "i":
                            es3.deshabilitarParlante(1, false);
                            break;
                        case "s":
                            es3.deshabilitarParlante(2, false);
                            break;
                    }
                    break;
                case "j":
                    System.out.println("Indique D para apagar el derecho, I para apagar el Izquierdo, S para apagar el Subwoofer");
                    String apaga = inicio.next();
                    apaga = apaga.toLowerCase();
                    switch (apaga) {
                        case "d":
                            es3.deshabilitarParlante(0, true);
                            break;
                        case "i":
                            es3.deshabilitarParlante(1, true);
                            break;
                        case "s":
                            es3.deshabilitarParlante(2, true);
                            break;
                    }
                    break;
                case "k":
                    option = false;
                    break;
            }

            System.out.print("\n");
        }
    } 
    
}
