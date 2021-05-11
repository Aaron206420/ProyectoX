/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenExtraordinario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaronxd
 */
public class VehiculosVista {
    public FabricaVehiculos agencia;
    public VehiculosVista(FabricaVehiculos agencia) {
        this.agencia = agencia;
    }
    public int menu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar Vehiculo\n2.Agregar motor\n3.Agregar llantas" 
                + "\n4.Mostrar Lista Vehiculos\n5.Mostrar lista de llantas \n6.Mostrar motor\n7.salir"));
        return menu;
    }
    public void agregarVehiculo(Vehiculo vl) {
        String modelo = JOptionPane.showInputDialog("Digite el modelo del automovil: ");
        String motor = JOptionPane.showInputDialog("Digite especificaciones del motor: ");
        String color = JOptionPane.showInputDialog("Digite el color del automovil: ");
        String marca = JOptionPane.showInputDialog("Digite la marca del automovil: ");
        String estado = JOptionPane.showInputDialog("Digite el estado de venta del vehiculo ");

        vl.setModelo(modelo);
        vl.setMarca(marca);
        vl.setColor(color);
        vl.setEstado(estado);
    }
    public void agregarMotor(Motor motor) {
        float peso=Float.parseFloat(JOptionPane.showInputDialog("digite el peso"));
        String Motor = JOptionPane.showInputDialog("Digite el tipo de motor: ");
        String caracteristicas = JOptionPane.showInputDialog("Digite las caracteristicas del motor: ");
        String estado = JOptionPane.showInputDialog("Digite el estado de venta del motor: ");
        String nunserie = JOptionPane.showInputDialog("Digite el numero de serie del motor: ");

        motor.setMarca(Motor);
        motor.setPeso(peso);
        motor.setEstado(estado);
        motor.setNunserie(nunserie);
    }
    public void agregarLlanta(Llanta llanta) {
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las llantas: "));
        String nunSerie = JOptionPane.showInputDialog("Digite el numero de serie de las llantas: ");
        String marca = JOptionPane.showInputDialog("Digite la marca de las llantas: ");
        String estado = JOptionPane.showInputDialog("Digite el estado de las llantas: ");

        llanta.setMarca(marca);
        llanta.setModelo(estado);
        llanta.setAltura(tamaño);
	}
    public void imprimirAviso(String Reporte) {
        JOptionPane.showMessageDialog(null, Reporte);
	}
}
