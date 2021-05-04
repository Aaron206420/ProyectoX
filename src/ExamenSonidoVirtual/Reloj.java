/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSonidoVirtual;

/**
 *
 * @author Aaron
 */
public class Reloj {

    int hora;
    int minuto;

    
    public void setAlarm(int hora, int minuto) {
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("hora, minuto y/o segundo estaban fuera de rango");
        }

        this.hora = hora;
        this.minuto = minuto;
       
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    

}
