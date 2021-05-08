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
public class Reloj {
    int minuto;
    int hora;
    boolean time;
    
    public void setAlarm(int hora, int minuto){
        this.minuto = minuto;
        this.hora = hora;
        this.time = true;
        
        while(time){
            if(1 == 1){
                EquipoSonido3 es3 = new EquipoSonido3();
                es3.alarma("0110111000001");
                this.time = true;        
            }
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
        
    
    }
    