/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoSonido2;

/**
 *
 * @author Aaron
 */
public class ParlanteIzquierda {
    int volumen;
    boolean habilitar;
    
    public Audio sonar(Audio mp3){
        return mp3;
    }
    
    public boolean habilitar(boolean habilitar){
        return false;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
}
