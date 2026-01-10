/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Decorator;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class DecoratorDemo extends Demo {

    public static void main(String[] args) {
        new DecoratorDemo().run();
    }

    @Override
    public void run() {
        Car sportsCar = new SportsCar(new BasicCar());

        sportsCar.assemble();
        sep();
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));

        sportsLuxuryCar.assemble();
    }

}
