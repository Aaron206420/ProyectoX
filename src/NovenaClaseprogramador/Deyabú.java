/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovenaClaseprogramador;

import Programaoclase8.*;

/**
 *
 * @author Aaron
 */
public class Deyabú {
    public static void main(String[] args) {
        Delnombre acta1 = new Delnombre();
        acta1.nombre1 = "Juan";
        acta1.nombre2 = "Soriana";
        acta1.setCedula1("1-123-3245");
        acta1.setCedula2("1-6754-0935");
        System.out.println(acta1.toString());

        Delnombre acta2 = new Delnombre();
        acta2.nombre1 = "FELIPE";
        acta2.nombre2 = "Chuz";
        acta2.setCedula1("1-6754-2695");
        acta2.setCedula2("1-3424-06678");
        System.out.println(acta2.toString());

        Delnombre acta3 = new Delnombre();
        acta3.nombre1 = "Sed";
        acta3.nombre2 = "Carmen";
        acta1.setCedula1("1-6574-9641");
        acta1.setCedula1("1-4532-5092");
        acta3.establecerVersion(420184);
        System.out.println(acta3.toString());

        Tiempo1 t = new Tiempo1();
        t.establecerTiempo(7, 15, 30);
        System.out.println(t.aStringUniversal());
    }
}
