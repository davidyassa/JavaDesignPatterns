/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory;

import Resources.Demo;
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
        String input = "";
        while (input != null) {
            System.out.print("Enter Desired Shape: ");
            input = sc.nextLine().trim();
            Shape s;
            try {
                s = new ShapeFactory().getShape(input.toLowerCase());
                Object numSides = s.getNumSides() == -1 ? "Infinite" : s.getNumSides();
                System.out.println("Shape: " + s.getName() + "\nNumber of Sides: " + numSides + "\nDraw: " + s.draw() + "\n");
                if (s == null) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("Exiting...");
                System.exit(0);
            }

        }
    }
}
