/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoSonido3;

import java.util.Random;

/**
 *
 * @author Aaron
 */
public class EquipoSonido3 {
    Parlante[] parlante =new Parlante[3];
    String[] listaAudio = new String[1000];
    String[] listaAudioRandom = new String[1000];
    boolean radio64;
    boolean random;
    
    public EquipoSonido3(){
        playlist();
        Parlante parlanteDerecho = new Parlante("Derecho");
        Parlante parlanteIzquierdo = new Parlante("Izquierda");       
        Parlante parlanteSubwoofer = new Parlante("Grave");
        this.parlante[1] = parlanteDerecho;
        this.parlante[2] = parlanteIzquierdo;
        this.parlante[3] = parlanteSubwoofer;
        this.radio64 = false;
        this.random = false;
    
    }
    
    public void playlist(){
        for(int i=0; i<this.listaAudio.length; i++){
            listaAudio[i]= "";
        }
    }
    
    public void alarma(String audio){
        sonarParlantes(audio);
    }
    
    
    public Parlante[] getParlante() {
        return parlante;
    }

    public void setParlante(Parlante[] parlante) {
        this.parlante = parlante;
    }

    public String[] getListaAudio() {
        return listaAudio;
    }

    public void setListaAudio(String[] listaAudio) {
        this.listaAudio = listaAudio;
    }

    public String[] getListaAudioRandom() {
        return listaAudioRandom;
    }

    public void setListaAudioRandom(String[] listaAudioRandom) {
        this.listaAudioRandom = listaAudioRandom;
    }

    public boolean isRadio64() {
        return radio64;
    }

    public void setRadio64(boolean radio64) {
        this.radio64 = radio64;
    }

    public boolean isRandom() {
        return random;
    }

    public void setRandom(boolean random) {
        this.random = random;
    }
    
    
    public void audioPlaylist(){
        for(int i=0; i< 1000; i++){
            if (listaAudio[i].equals("") == false) {
                System.out.println("audio#"+i+":"+listaAudio[i]);
            }
        }
    }
    
    public void borrarAudio(int borrar){
        if(borrar != -1){
            listaAudio[borrar] = "";
        }
    }
    
    public void playRadio64(){
        if(this.radio64){
            sonarParlantes("Radio64: 0101010101001110000");
        }
        else{
            if(this.random){
                for(int i=0; i< listaAudio.length; i++){
                    if(listaAudio.equals("")== false){
                        sonarParlantes(listaAudioRandom[i]);
                    }
                }
            }
            else{
                for(int i=0; i< listaAudio.length; i++){
                    if(listaAudio.equals("")== false){
                        sonarParlantes(listaAudioRandom[i]);
                    }
                }
            }
        }
    }
    
    public void ajustarVolumen(int volumen){
        for(int i=0; i< this.parlante.length; i++){
            parlante[i].setVolumen(volumen);
        }
    }
    
    public void subirVolumenLados(){
        parlante[1].subirVolumen();
        parlante[2].subirVolumen();
    }
    public void bajarVolumenLados(){
        parlante[1].bajarVolumen();
        parlante[2].bajarVolumen();
    }
    
    public void subirVolumenGraves(){
        parlante[3].subirVolumen();
    }
    public void bajarVolumenGraves(){
        parlante[3].bajarVolumen();
    }
    
    public void deshabilitarParlante(int parlantes, boolean status){
        parlante[parlantes].setHabilitar(status);
    }
    public String agregarAudio(String audio){
        String copy ="";
        for(int i=0; i< this.listaAudio.length; i++){
            if(this.listaAudio[i]== ""){
               this.listaAudio[i]= audio;
               copy = "Audio agregado";
            }
        }
        return copy;
    }
    
    public void timeReloj(int hora, int minuto){
        Reloj time = new Reloj();
        time.setAlarm(hora, minuto);
    }
    
    public void sonarParlantes(String audio){
        for(int i=0; i< this.parlante.length; i++){
            parlante[i].sonar(audio);
        }
    }
    
    private void listaRandom(){
        int[] randon = new int[1000];
        for(int i=0; i< randon.length ;i++){
            randon[i]= randomForever(randon);
        }
        for(int i=0; i< listaAudioRandom.length ;i++){
            int randy = randon[i]-1;
            listaAudioRandom[i] = listaAudio[randy];
        }
    }
    private static int randomForever(int[] newArray){
        Random rio = new Random();
        int valor = newArray.length;
        int random = -1;
        boolean randomfainal = true;
        while(randomfainal){
            random = rio.nextInt(valor)+1;
            for(int i=0; i< newArray.length; i++){
                if(random == newArray[i]){
                    random = -1;
                    break;
                }
            }
            if(random> -1){
                randomfainal = false;
            }
        }
        return random;
    }
}
