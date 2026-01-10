/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Bridge;

/**
 *
 * @author DELL 7550
 */
public class BigWheel extends Car {

    public BigWheel(Product product, String carType) {
        super(product, carType);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("***Adding BigWheel Signature***");
    }

    @Override
    public void produceProduct() {
        super.produceProduct();
        System.out.println("***Adding Sunroof***");
    }
}
