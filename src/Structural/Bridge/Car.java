/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Bridge;

/**
 *
 * @author DELL 7550
 */
public abstract class Car {

    private final Product product;
    private final String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

//    public abstract void assemble();
//    public abstract void produceProduct();
    public void assemble() {
        System.out.println("Assembling [" + product.productName() + "] for (" + carType + ")");
    }

    public void produceProduct() {
        product.produce();
        System.out.println("Modifying [" + product.productName() + "] according to (" + carType + ")");
    }

    public void printDetails() {
        System.out.println("Product: " + product.productName() + "; carType: " + carType);
    }
}
