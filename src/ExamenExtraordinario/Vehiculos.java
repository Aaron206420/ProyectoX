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
public class Vehiculos {
    String color;
    String marca;
    String modelo;
    int age;
    Motor motor;
    Llanta llanta1;
    Llanta llanta2;
    Llanta llanta3;
    Llanta llanta4;

    public Vehiculos(Motor motor, Llanta llanta1, Llanta llanta2, Llanta llanta3, Llanta llanta4) {
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
    
    
}
