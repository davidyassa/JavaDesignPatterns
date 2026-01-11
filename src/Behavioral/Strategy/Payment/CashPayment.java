/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.Strategy.Payment;

import static Demo.Demo.dotsLoop;

/**
 *
 * @author DELL 7550
 */
public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.print("Counting Bills");
        dotsLoop(3);
        System.out.println("\nPayment Successful!");
    }

}
