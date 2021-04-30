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
public class ChesterChetos {
    public static void main(String[] args) {
        Cliente roxy = new Cliente(
                "Aaron",
                "La Isla",
                "aaronoviedolaino@gmail.com",
                "sin codigo ups",
                "codigo postal simon :v",
                48441.00F
        );
        Producto product11 = new Producto("1","Reloj","Dora la exploradora");
        LineaItem lineal8 = new LineaItem(4,6777F,product11);
        
        Producto product9 = new Producto("2","PlayStation","II");
        LineaItem lineal2 = new LineaItem(8,98665F,product9);
        
        CarritoMotorizadoCompras carrito = roxy.getCarrito();
        carrito.agregarLinea(lineal8);
        carrito.agregarLinea(lineal2);
        
    }
}
