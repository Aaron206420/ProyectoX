/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseProgra14;

import java.util.Date;

/**
 *
 * @author Aaron
 */
public class CarritoMotorizadoCompras {

    private Date created;
    private int contadorLineas;
    private LineaItem[] lines;

    public CarritoMotorizadoCompras() {
        created = new Date();
        lines = new LineaItem[100];
        contadorLineas = 0;
    }

    public void agregarLinea(LineaItem linea){
        lines[contadorLineas] =linea;
        contadorLineas++;
    }
    
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public LineaItem[] getLines() {
        return lines;
    }

    public void setLines(LineaItem[] lines) {
        this.lines = lines;
    }

}
