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
public class EquipoSonidoControlador2 {
    EquipoSonido2 es2 = new EquipoSonido2();
    EquipoSonidoVista2 esv2 = new EquipoSonidoVista2(es2);
    
    public void iniciar(){
        while(true){
            switch(esv2.menu()){
                case 0:
                {
                    esv2.agregarAudio();
                    break;
                }
                case 1:
                {
                    esv2.borrarAudio();
                    break;
                }
                case 2:
                {
                    esv2.menuplaylist();
                    break;
                }
                case 3:
                {
                    esv2.listaOrden();
                    break;
                }
                case 4:
                {
                    esv2.listaRandom();
                    break;
                }
                case 5:
                {
                    esv2.setVolumen();
                    break;
                }
                case 6:
                {
                    esv2.radioK();
                    break;
                }
                case 7:
                {
                    esv2.setAlarm();
                    break;
                }
                case 8:
                {
                    esv2.setParlante();
                    break;
                }    
            }
        }
    }
    
}
