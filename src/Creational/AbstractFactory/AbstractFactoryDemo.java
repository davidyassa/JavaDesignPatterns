/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory;

import Demo.Demo;
import java.util.Scanner;

/**
 *
 * @author DELL 7550
 */
public class AbstractFactoryDemo extends Demo {

    public static void main(String[] args) {
        new AbstractFactoryDemo().run();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Build a ButtonScreen!");
        System.out.print("Enter Button Manufacturer: ");
        String input1 = sc.nextLine().trim();
        PhoneFactory factory1 = new FactoryProducer().getFactory(input1.toLowerCase());
        Button b = factory1.createButton();
        System.out.print("Enter Screen Manufacturer: ");
        String input2 = sc.nextLine().trim();
        Screen s;
        if (!input1.equalsIgnoreCase(input2)) {
            PhoneFactory factory2 = new FactoryProducer().getFactory(input2.toLowerCase());
            s = factory2.createScreen();
        } else {
            s = factory1.createScreen();
        }
        System.out.println("Phone Created!\nDisplaying Details...");
        b.printDeets();
        s.printDeets();

    }

}
