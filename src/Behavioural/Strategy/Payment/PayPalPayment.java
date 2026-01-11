/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural.Strategy.Payment;

import static java.lang.Thread.sleep;

/**
 *
 * @author DELL 7550
 */
public class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.print("Connecting to PayPal servers");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                sleep((long) 1000);
            } catch (InterruptedException ex) {
                System.getLogger(PayPalPayment.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        System.out.println("\nPayment Successful!");
    }

}
