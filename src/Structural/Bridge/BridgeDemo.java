/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Bridge;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class BridgeDemo extends Demo {

    public static void main(String[] args) {
        new BridgeDemo().run();
    }

    @Override
    public void run() {
        Product product1 = new CentralLocking("Central Locking System");
        Car car1 = new BigWheel(product1, "BigWheel XZ model");
        car1.produceProduct();
        car1.assemble();
        car1.printDetails();

        sep();

        Product product2 = new GearLocking("Gear Locking System");
        Car car2 = new Motoren(product2, "Motoren LM model");
        car2.produceProduct();
        car2.assemble();
        car2.printDetails();
    }
}
