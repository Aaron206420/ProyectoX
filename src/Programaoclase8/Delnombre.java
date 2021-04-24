package Programaoclase8;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aaron
 */
public class Delnombre {

    public String nombre1;
    public String nombre2;
    private int version = 420184;
    private String lugar;
    private String cedula1;
    private String cedula2;
    
    /**
     * Imprime el acta
     */
    public void muchoTexto() {
        String texto = "a los que sacaron mal el examen" + nombre1 + " " + nombre2;
        System.out.println(texto);
    }
    
    /**
     * Imprime el acta con logo el cual es **
     */
    public void muchoTextoLogo() {
        String texto = "a los que sacaron mal el examen" + nombre1 + " " + nombre2;
        System.out.println(texto);
    }
    
    public void establecerVersion(int elnuevo) {
        if (elnuevo > version) {
            version = elnuevo;
        } else {
            System.out.println("Error para el nuevo");

        }
    }

    public void horaActa() {
        Date fecha = new Date();
        System.out.println("La fecha es: " + fecha);

    }

    public void setlugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCedula1(String cedula1) {
        if (cedula1.length() != 11) {
            System.out.println("Revisa la cedula");
        } else {
            this.cedula1 = cedula1;
        }
    }

    public void setCedula2(String cedula2) {
        if (cedula2.length() != 11) {
            System.out.println("Revisa la cedula");
        } else {
            this.cedula2 = cedula2;
        }
    }

    public String getCedula1() {
        return cedula1;
    }

    public String getCedula2() {
        return cedula2;
    }

}
