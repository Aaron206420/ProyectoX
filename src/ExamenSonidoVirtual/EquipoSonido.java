/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenSonidoVirtual;

import java.util.Arrays;

/**
 *
 * @author Aaron
 */
public class EquipoSonido {
    
    int registros;
    String[] listaAudio;
    int cont;
    
    //Parlante derecho = new  Parlante(true, 0, "derecho");
    //Parlante izquierdo = new  Parlante(true, 0, "izqierdo");
    ParlanteSubwoofer bajos = new ParlanteSubwoofer();
    
    
    public EquipoSonido(){
        registros = 1000;
        listaAudio = new String[registros];
        cont =0;
    }
    
    public void imprimirlistaAudio(){
        for(String elem: listaAudio){
            System.out.println(elem);
        }
    }
    public void listaOrdenada(){
        Arrays.sort(listaAudio);
        imprimirlistaAudio();
    }
    
    public void listaCompleta(){
        
    }
    
    public void listamusical(){
        for(int i= 0; i< cont; i++){
            System.out.println(listaAudio[i]+",");
        }
    }
    
    public boolean agregarlistaAudio(String nuevoAudio){
        boolean resultado = false;
        if(cont< registros){
            listaAudio[cont]= nuevoAudio;
            cont++;
            resultado = true;
        }
        return resultado;
    }
    
    public boolean eliminarlistaAudio(){
        boolean resultado = false;
        if(cont!=0){
            cont--;
            listaAudio[cont-1]= null;
            resultado = true;
        }
        return resultado;
    }
}
