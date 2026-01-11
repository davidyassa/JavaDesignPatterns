/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

import static Demo.Demo.*;
import static Demo.DemoMenus.*;

/**
 *
 * @author DELL 7550
 */
public class DemoApp {

    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        DemoController controller = new DemoController();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            clearScreen();
            System.out.print(CATEGORIES_MENU);
            System.out.print("Choose Pattern Category: ");
            int category = sc.nextInt();

            clearScreen();
            switch (category) {
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                case 1 ->
                    System.out.print(BEHAVIORAL_MENU);

                case 2 ->
                    System.out.print(CREATIONAL_MENU);

                case 3 ->
                    System.out.print(STRUCTURAL_MENU);

                default -> {
                    System.out.print("Invalid category");
                    dotsLoop(3);
                    System.out.println();
                    continue;
                }
            }
            System.out.print("Choose Pattern: ");

            int choice = sc.nextInt();
            if (choice == 0) {
                continue; // back to categories
            }
            try {
                controller.runDemo(category, choice);
                buffer();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
