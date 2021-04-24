package Tarea3y8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Capitulo3 {

    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    public static void main(String[] args) {
        // Uso de JOptionPane para mostrar varias líneas en un cuadro de diálogo.
        // muestra un diálogo con un mensaje
        JOptionPane.showMessageDialog(null, "Uso del metodo JOptionPane");
    }
    // Constructor de Cuenta que recibe dos parámetros

    public void cuenta(String nombre, double saldo) {

        this.nombre = nombre; // asigna nombre a la variable de instancia nombre

        // valida que el saldo sea mayor que 0.0; de lo contrario,
        // la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if (saldo > 0.0) // si el saldo es válido
        {
            this.saldo = saldo; // lo asigna a la variable de instancia saldo
        }
    }
    // método que deposita (suma) sólo una cantidad válida al saldo

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) // si el montoDeposito es válido
        {
            saldo = saldo + montoDeposito; // lo suma al saldo
        }
    }

    // método que devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }

    // método que establece el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre; //devuelve el valor de name a quien lo invocó
    } // fin del método obtenerNombre

}
