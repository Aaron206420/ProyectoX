/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3y8;

/**
 *
 * @author Aaron
 */
public class Capitulo8 {

    public static void main(String[] args) {
        TiempoSimple tiempo = new TiempoSimple(15, 30, 19);
        System.out.println(tiempo.crearString());
    }
} // fin de la clase PruebaThis

// la clase TiempoSimple demuestra la referencia “this”
class TiempoSimple {

    private int hora; // 0-23
    private int minuto; // 0-59
    private int segundo; // 0-59

    // si el constructor utiliza nombres de parámetros idénticos a
    // los nombres de las variables de instancia, se requiere la
    // referencia “this” para diferenciar unos nombres de otros
    public TiempoSimple(int hora, int minuto, int segundo) {
        this.hora = hora; // establece la hora del objeto “this”
        this.minuto = minuto; // establece el minuto del objeto “this”
        this.segundo = segundo; // establece el segundo del objeto “this”
    }

    // usa la referencia “this” explícita e implícita para llamar aStringUniversal
    public String crearString() {
        return String.format("%24s: %s%n%24s: %s",
                "this.aStringUniversal()", this.aStringUniversal(),
                "aStringUniversal()", aStringUniversal());
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        // “this” no se requiere aquí para acceder a las variables de instancia,
        // ya que el método no tiene variables locales con los mismos
        // nombres que las variables de instancia
        return String.format("%02d:%02d:%02d",
                this.hora, this.minuto, this.segundo);
    }

    //Fechas
    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int age; // cualquier año

    private static final int[] diasPorMes
            = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

// constructor: confirma el valor apropiado para el mes y el día, dado el año;
    public void Fecha(int mes, int dia, int age) {
// revisa si el mes está en el rango
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException(
                    "mes (" + mes + ") debe ser 1-12");
        }

        // revisa si dia está en el rango para mes
        if (dia <= 0
                || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        }

        // revisa si es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !(age % 400 == 0
                || (age % 4 == 0 && age % 100 != 0))) {
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y age especificados");
        }

        this.mes = mes;
        this.dia = dia;
        this.age = age;

        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
    }

    // devuelve un objeto String de la forma mes/dia/anio
    public String toString() {
        return String.format("%d/%d/%d", mes, dia, age);
    }
}
