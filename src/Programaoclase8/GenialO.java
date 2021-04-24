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
public class GenialO {

    public static void main(String[] args) {
        int contCedula1 = 0;// cantidad que inician en 1
        int contCedula2 = 0;// cantidad que no inician en 1

        Delnombre acta1 = new Delnombre();
        acta1.nombre1 = "Juan";
        acta1.nombre2 = "Soriana";
        acta1.setCedula1("1-123-3245");
        acta1.setCedula2("1-6754-0935");
        acta1.muchoTextoLogo();
        int genialnun = Integer.parseInt(String.valueOf(acta1.getCedula1().charAt(0)));
        if (genialnun == 1) {
            contCedula1++;
        } else {
            contCedula2++;
        }

        Delnombre acta2 = new Delnombre();
        acta2.nombre1 = "FELIPE";
        acta2.nombre2 = "Chuz";
        acta2.setCedula1("1-6754-2695");
        acta2.setCedula2("1-3424-06678");
        acta2.muchoTexto();
        genialnun = Integer.parseInt(String.valueOf(acta2.getCedula1().charAt(0)));
        if (genialnun == 1) {
            contCedula1++;
        }  else {
            contCedula2++;
        }

        Delnombre acta3 = new Delnombre();
        acta3.nombre1 = "Sed";
        acta3.nombre2 = "Carmen";
        acta1.setCedula1("1-6574-9641");
        acta1.setCedula1("1-4532-5092");
        acta3.establecerVersion(420184);
        acta3.muchoTexto();
        genialnun = Integer.parseInt(String.valueOf(acta3.getCedula1().charAt(0)));
        if (genialnun == 1) {
            contCedula1++;
        } else {
            contCedula2++;
        }

        System.out.println("contCedula1 " + contCedula1);
        System.out.println("contCedula2 " + contCedula2);
    }
}
