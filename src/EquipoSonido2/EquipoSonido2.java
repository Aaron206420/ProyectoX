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
public class EquipoSonido2 {

    Audio playlist[];
    Reloj time;
    ParlanteDerecha pda;
    ParlanteIzquierda pid;
    ParlanteSubwoofer psw;
    boolean radio;
    boolean audiomenu;

    public EquipoSonido2() {
        this.playlist = new Audio[1000];
        for (int i = 0; i < 1000; i++) {
            this.playlist[i].setAudio("");
        }
        this.time = time;
        this.pda = pda;
        this.pid = pid;
        this.psw = psw;

        audiomenu = true;
        radio = false;
    }

    public void Audioplaylist(String mp3, int nun) {
        this.playlist[nun].setAudio(mp3);
    }

    public void borrarlistaAudio(int nun) {
        String mp3 = "";
        this.playlist[nun].setAudio(mp3);
    }

    public String menuplaylist() {
        String menuplaylist = "";
        for (int i = 0; i < 1000; i++) {
            menuplaylist += "Audio: ";
            menuplaylist += this.playlist[i].getAudio();
            menuplaylist += "\n";         
        }
        return menuplaylist;
    }
    
    public String listaaudioOrdenado(){
        String audioOrdenado = "";
         for (int i = 0; i < 1000; i++) {
            audioOrdenado += "Play: ";
            audioOrdenado += this.playlist[i].getAudio();
            audioOrdenado += "\n"; 
            geoAudio(this.playlist[i]);
         }
         return audioOrdenado;
    }
     public String listaaudioRandom(){
        String audioOrdenado = "";
         for (int i = 0; i < 1000; i++) {
            audioOrdenado += "Play: ";
            audioOrdenado += this.playlist[i].getAudio();
            audioOrdenado += "\n"; 
            geoAudio(this.playlist[i]);
         }
         return audioOrdenado;
    }
    
     public void geoAudio(Audio mp3){
        this.pda = pda;
        this.pid = pid;
        this.psw = psw;
    }
     
    public void setVolume(int pdaVol, int pidVol, int pswVol){ 
        this.pda.setVolumen(pdaVol);
        this.pid.setVolumen(pidVol);
        this.psw.setVolumen(pswVol);
    }
    
    public String setmenuStereo(boolean radio){
        if(radio==true){
            //this.playlist = false;
            this.radio = true;
        }
        else
            //this.playlist = true;
            this.radio = false;
            
            Audio radio64 = new Audio();
            return radio64.getAudioweb();
    }
        
    public void tiempoAudio(int hora, int minutos){
        time.setAlarm(hora, minutos);
    }
    
    public void parlantes(boolean estado){
        pda.habilitar = estado;
        pid.habilitar = estado;
        psw.habilitar = estado;
    }
    
}
