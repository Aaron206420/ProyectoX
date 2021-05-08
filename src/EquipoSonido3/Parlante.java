/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoSonido3;

/**
 *
 * @author Aaron
 */
public class Parlante {
    String tipoParlante;
    int volumen;
    boolean habilitar;

    public Parlante(String tipoParlante) {
        this.tipoParlante = tipoParlante;
        this.volumen = 9;
        this.habilitar = false;
    }
    
    public void sonar(String audio){
        if(!this.habilitar){
            System.out.println("audio del parlante"+ tipoParlante +"'audio'"+ audio +"volumen"+ this.volumen +" ");
        }
        
    }
    
    public void subirVolumen(){
        int volumen = this.volumen;
        if(volumen< 10){
            this.volumen++;
        }
        
    }
    public void bajarVolumen(){
        int volumen = this.volumen;
        if(volumen> 0){
            this.volumen--;
        }
        
    }

    public String getTipoParlante() {
        return tipoParlante;
    }

    public void setTipoParlante(String tipoParlante) {
        this.tipoParlante = tipoParlante;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if(volumen >= 10){
            volumen = 10;
            System.out.println("Volumen max10");
        }
        if(volumen < 0){
            volumen = 0;
            System.out.println("Volumen max10");
        }
        this.volumen = volumen;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }
    
    
}
