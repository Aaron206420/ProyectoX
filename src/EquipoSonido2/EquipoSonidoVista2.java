/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoSonido2;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class EquipoSonidoVista2 {

    EquipoSonido2 es2;
    Scanner r;

    public EquipoSonidoVista2(EquipoSonido2 sistema) {
        this.es2 = sistema;
    }

    public int menu() {
        int option;
        System.out.println("Menu"
                + "\n"
                + "\n0 - agregar nuevo audio"
                + "\n1 - barrar audio"
                + "\n2 - ver la playlist"
                + "\n3 - Lista en orden"
                + "\n4 - Lista a lo Random"
                + "\n5 - subir / bajar volumen"
                + "\n6 - Radio64 (encender / apagar)"
                + "\n7 - encender time"
                + "\n\nSeleccione una opcion");
        
        return option = r.nextInt();
    }

    public void agregarAudio() {
        System.out.println("agregar nuevo audio");
        String mp3 = r.next();
        System.out.println("agregar el audio en la lista (0/1000)");
        int nun = r.nextInt();
        es2.Audioplaylist(mp3, nun);
    }

    public void borrarAudio() {
        System.out.println("seleccione audio para borrar");
        int nun = r.nextInt();
        es2.borrarlistaAudio(nun);
    }

    public void menuplaylist() {
        System.out.println(es2.menuplaylist());
        System.out.println("\n");
    }

    public void listaOrden() {
        System.out.println(es2.listaaudioOrdenado());
        System.out.println("\n");
    }

    public void listaRandom() {
        System.out.println(es2.listaaudioRandom());
        System.out.println("\n");
    }

    public void setVolumen() {
        int pdavol = 0;
        int pidvol = 0;
        int pswvol = 0;

        do {
            System.out.println("subir volumen parlante derecho");
            pdavol = r.nextInt();
        } while (pdavol > 10);

        do {
            System.out.println("subir volumen parlante izquierdo");
            pidvol = r.nextInt();
        } while (pidvol > 10);

        do {
            System.out.println("subir volumen parlante grave");
            pswvol = r.nextInt();
        } while (pswvol > 10);

    }

    public void radioK() {
        System.out.println("Radio enceder/apagar");
        boolean radio64 = r.nextBoolean();
        System.out.println(es2.setmenuStereo(radio64));

        if (radio64 == true) {
            System.out.println("enceder/apagar");
        } else {
            System.out.println("apagar/encender");
        }

    }

    public void setAlarm() {
        System.out.println("indicar la hora de alarma");
        int hora = r.nextInt();
        System.out.println("indicar los minutos de alarma");
        int minutos = r.nextInt();
        es2.tiempoAudio(hora, minutos);

        System.out.println("la alarma sera" + es2.time.getHora() + ":" + es2.time.getMinuto());

    }

    public void setParlante() {
        System.out.println("Activar parlantes");
        boolean sistema = r.nextBoolean();
        es2.parlantes(sistema);
    }
}
