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
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar Vehiculo\n2.Agregar motor\n3.Agregar llanta1" +"\n4.Agregar llanta2 \n5.Agregar llanta3 \n6.Agregar llanta4"
                + "\n7.Mostrar Lista Vehiculos\n8.Mostrar lista de llantas \n9.Mostrar motor\n10.salir"));
        return menu;
    }
    public void agregarVehiculo(Vehiculo vl) {
        String modelo = JOptionPane.showInputDialog("Digite el modelo del automovil: ");
        String motor = JOptionPane.showInputDialog("Digite especificaciones del motor: ");
        String color = JOptionPane.showInputDialog("Digite el color del automovil: ");
        String marca = JOptionPane.showInputDialog("Digite la marca del automovil: ");
        String estado = JOptionPane.showInputDialog("Digite el año de venta del vehiculo ");

        vl.setModelo(modelo);
        vl.setMarca(marca);
        vl.setColor(color);
        vl.setEstado(estado);
    }
    public void agregarMotor(Motor motor) {
        float peso=Float.parseFloat(JOptionPane.showInputDialog("digite el peso"));
        String Motor = JOptionPane.showInputDialog("Digite el tipo de motor: ");
        String nunserie = JOptionPane.showInputDialog("Digite el numero de serie del motor: ");

        motor.setMarca(Motor);
        motor.setPeso(peso);
        motor.setNunserie(nunserie);
    }
    public void agregarLlanta1(Llanta llanta1) {
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las llantas: "));
        String marca = JOptionPane.showInputDialog("Digite la marca de las llantas: ");
        String modelo = JOptionPane.showInputDialog("Digite el modelo de las llantas: ");

        llanta1.setMarca(marca);
        llanta1.setModelo(modelo);
        llanta1.setAltura(tamaño);
	}
    public void agregarLlanta2(Llanta llanta2) {
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las llantas: "));
        String marca = JOptionPane.showInputDialog("Digite la marca de las llantas: ");
        String modelo = JOptionPane.showInputDialog("Digite el modelo de las llantas: ");

        llanta2.setMarca(marca);
        llanta2.setModelo(modelo);
        llanta2.setAltura(tamaño);
	}
    public void agregarLlanta3(Llanta llanta3) {
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las llantas: "));
        String marca = JOptionPane.showInputDialog("Digite la marca de las llantas: ");
        String modelo = JOptionPane.showInputDialog("Digite el modelo de las llantas: ");

        llanta3.setMarca(marca);
        llanta3.setModelo(modelo);
        llanta3.setAltura(tamaño);
	}
    public void agregarLlanta4(Llanta llanta4) {
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de las llantas: "));
        String marca = JOptionPane.showInputDialog("Digite la marca de las llantas: ");
        String modelo = JOptionPane.showInputDialog("Digite el modelo de las llantas: ");

        llanta4.setMarca(marca);
        llanta4.setModelo(modelo);
        llanta4.setAltura(tamaño);
	}
    public void imprimirAviso(String Reporte) {
        JOptionPane.showMessageDialog(null, Reporte);
	}
}
