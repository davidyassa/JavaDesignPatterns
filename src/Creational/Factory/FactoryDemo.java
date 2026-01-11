/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory;

import Demo.Demo;
import java.util.Scanner;

/**
 *
 * @author DELL 7550
 */
public class FactoryDemo extends Demo {

    public static void main(String[] args) {
        new FactoryDemo().run();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter Desired Shape (Press Enter to exit): ");
            input = sc.nextLine().trim();
            Shape s;
            try {
                s = new ShapeFactory().getShape(input.toLowerCase());
                Object numSides = s.getNumSides() == -1 ? "Infinite" : s.getNumSides();
                System.out.println("Shape: " + s.getName() + "\nNumber of Sides: " + numSides + "\nDraw: " + s.draw() + "\n");
                if (s == null) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e1) {
                System.out.println(e1.getMessage());
            } catch (Exception e2) {
                System.out.println("Exiting...");
                System.exit(0);
            }

        }
    }
}
