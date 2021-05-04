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
        String color;
        String altura;
        int volumen;
        boolean habilitar;
        String pocision;

    public Parlante(){
        
    }

    public Parlante(String color, String altura, int volumen, boolean habilitar, String pocision) {
        this.color = color;
        this.altura = altura;
        this.volumen = volumen;
        this.habilitar = habilitar;
        this.pocision = pocision;
    }
    public Parlante(String color, String altura) {
        this.color = color;
        this.altura = altura;
    }
    public Parlante( int volumen, boolean habilitar, String pocision) {
        this.volumen = volumen;
        this.habilitar = habilitar;
        this.pocision = pocision;
    }

    @Override
    public String toString() {
        return "Parlante{" + "color=" + color + ", altura=" + altura + ", volumen=" + volumen + ", habilitar=" + habilitar + ", pocision=" + pocision + '}';
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }

    public String getPocision() {
        return pocision;
    }

    public void setPocision(String pocision) {
        this.pocision = pocision;
    }
        
        
        
        

        
        
}
