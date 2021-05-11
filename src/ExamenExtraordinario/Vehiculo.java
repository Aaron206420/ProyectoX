/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenExtraordinario;

/**
 *
 * @author Aaron
 */
public class Vehiculo {

    String color;
    String estado;
    String marca;
    String modelo;
    int age;
    Motor motor;
    Llanta llanta1;
    Llanta llanta2;
    Llanta llanta3;
    Llanta llanta4;
    String vendido;

    public Vehiculo(){
        
    }

    Vehiculo(Llanta llantas, Motor motor) {
        
    }
    
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVendido() {
        return vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }

    
    

    public boolean vendido(boolean vendido) {
        return false;
    }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(Motor motor, Llanta llanta1, Llanta llanta2, Llanta llanta3, Llanta llanta4) {
        this.motor = motor;
        this.llanta1 = llanta1;
        this.llanta2 = llanta2;
        this.llanta3 = llanta3;
        this.llanta4 = llanta4;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta getLlanta1() {
        return llanta1;
    }

    public void setLlanta1(Llanta llanta1) {
        this.llanta1 = llanta1;
    }

    public Llanta getLlanta2() {
        return llanta2;
    }

    public void setLlanta2(Llanta llanta2) {
        this.llanta2 = llanta2;
    }

    public Llanta getLlanta3() {
        return llanta3;
    }

    public void setLlanta3(Llanta llanta3) {
        this.llanta3 = llanta3;
    }

    public Llanta getLlanta4() {
        return llanta4;
    }

    public void setLlanta4(Llanta llanta4) {
        this.llanta4 = llanta4;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", age=" + age + ", motor=" + motor + ", llanta1=" + llanta1 + ", llanta2=" + llanta2 + ", llanta3=" + llanta3 + ", llanta4=" + llanta4 + ", vendido=" + vendido + '}';
    }

}
