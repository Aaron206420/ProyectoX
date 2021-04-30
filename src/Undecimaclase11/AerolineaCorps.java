/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.s
 */
package Undecimaclase11;

import Decimaclase.Cliente;

/**
 *
 * @author Aaron
 */
public class AerolineaCorps {
    Cliente elCliente;
    Cliente otroCliente;
    
    public void iniciar(){
        elCliente = new Cliente();
        otroCliente = new Cliente(); 
        
        solicitarDatosCliente();
        generarReporteClientes();
    }
    
    public void solicitarDatosCliente(){
        elCliente.solicitarDatos();
    }
    
    public void generarReporteClientes(){
        String infoCliente = this.elCliente.toString();
        System.out.println(infoCliente);
    }
}
