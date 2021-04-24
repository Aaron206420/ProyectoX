/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovenaClaseprogramador;

/**
 *
 * @author Aaron
 */
public class TiposComplejos {
    public static void main (String []args){
        boolean programandotonight = true;
        Boolean programandoFinde = true;
        
        short codigo =  3789;
        Short codigonucleare = 8957;
        
        int ejericionuny = 100;
        Integer nunyejercicioFinde = 100;
        
        float salariomensual = 500.90f;
        Float salarioNeto = 9400.76f;
        
        double ii = 9.32;
        Double jj = 93.87;
        
        byte edad = 12;
        Byte edaddelwey = 19;
        
        // El objeto Short se converte a primitivo short
        // Estamos asignando un valor primitivo a una variable primitiva
        short superx = nunyejercicioFinde.shortValue();
        
        // El objeto Boolean se converte a primitivo boolean
        // Estamos asignando un valor primitivo a una variable primitiva
        boolean mentiroso = programandoFinde.booleanValue();
        
        //Estamos asignando un objeto a una variable primitiva
        short ganancia = codigonucleare;//unboxing
        
        //Estamos asignando una variable primitiva a un objeto
        short newmrX = codigonucleare;//autoboxing
        
        //En este caso shortValue() no es necesario ya que se podria hacer un unboxing
        short otraVarMas1 = codigonucleare.shortValue();
        
        //Autobuxin\ de primitiva a compleja(objeto)
        //Unboxing\ de compleja(objeto) a primitiva
        
    }

}