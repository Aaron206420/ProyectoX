/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenExtraordinario;

/**
 *
 * @author Aaron
 */
public class Motor {
    float peso;
    String marca;
    String nunserie;

    public Motor(float peso, String marca, String nunserie) {
        this.peso = peso;
        this.marca = marca;
        this.nunserie = nunserie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNunserie() {
        return nunserie;
    }

    public void setNunserie(String nunserie) {
        this.nunserie = nunserie;
    }
    
    
}
