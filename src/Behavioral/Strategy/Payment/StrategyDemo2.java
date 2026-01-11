/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.Strategy.Payment;

import Demo.Demo;

/**
 *
 * @author DELL 7550
 */
public class StrategyDemo2 extends Demo {

    private final CreditCardPayment CC = new CreditCardPayment();
    private final CashPayment Cash = new CashPayment();
    private final PayPalPayment PP = new PayPalPayment();

    public static void main(String[] args) {
        new StrategyDemo2().run();
    }

    @Override
    public void run() {
        Checkout aisle4 = new Cashier();
        try {
            aisle4.checkout(10);    //someone in a hurry
        } catch (IllegalStateException e) {

            System.out.println(e.getMessage());
        }
        aisle4.setMethod(Cash);
        aisle4.checkout(6.67);

        aisle4.setMethod(CC);
        aisle4.checkout(420);

        aisle4.setMethod(PP);
        aisle4.checkout(12345);
    }
}
