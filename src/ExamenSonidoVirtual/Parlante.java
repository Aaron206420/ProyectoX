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
public class Parlante {

    private int volumen;
    private boolean habilitar;
    private String direccionSonido;

    public boolean ushabilitar() {
        return habilitar;
    }

    public Parlante(int volumen, boolean habilitar, String direccionSonido) {
        this.volumen = volumen;
        this.habilitar = habilitar;
        this.direccionSonido = direccionSonido;
    }
    
    
    
    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getDireccionSonido() {
        return direccionSonido;
    }

    public void setDireccionSonido(String direccionSonido) {
        this.direccionSonido = direccionSonido;
    }

    public void subirVolumen() {
        volumen++;
    }

    public void bajarVolumen() {
        volumen--;
    }

    public void habilitar() {
        habilitar = true;
    }

    public void deshabilitar() {
        habilitar = false;
    }

}
