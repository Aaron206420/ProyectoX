/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseProgra14;

/**
 *
 * @author Aaron
 */
public class LineaItem {

    private int quantity;
    private float precio;
    private Producto product;

    public LineaItem(int quantity, float precio, Producto product) {
        this.quantity = quantity;
        this.precio = precio;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }
    
    
}
