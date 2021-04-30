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
public class Cliente {

    private String custername;
    private String address;
    private String email;
    private String credicCardInfo;
    private String shippingInfo;
    private float accountBalance;

    private final Pedido[] pedido;
    private int contadorPedidos;
    private CarritoMotorizadoCompras carrito;
    
    
    public Cliente(String custername, String address, String email, String credicCardInfo, String shippingInfo, float accountBalance) {
        this.custername = custername;
        this.address = address;
        this.email = email;
        this.credicCardInfo = credicCardInfo;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;

        pedido = new Pedido[694];
        contadorPedidos=0;
        carrito = new  CarritoMotorizadoCompras();

    }

    public void register() {
    }

    public void login() {
    }

    public void updateProfile() {
    }
    public void agregarPedido(Pedido k){
        this.pedido[contadorPedidos]=k;
        contadorPedidos++;
    }
    public String getCustername() {
        return custername;
    }

    public void setCustername(String custername) {
        this.custername = custername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addres) {
        this.address = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCredicCardInfo() {
        return credicCardInfo;
    }

    public void setCredicCardInfo(String credicCardInfo) {
        this.credicCardInfo = credicCardInfo;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public CarritoMotorizadoCompras getCarrito() {
        return carrito;
    }

    
    
}
