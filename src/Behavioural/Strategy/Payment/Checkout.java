/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Behavioural.Strategy.Payment;

/**
 *
 * @author DELL 7550
 */
public abstract class Checkout {

    private Payment method;

    public final void setMethod(Payment method) {
        this.method = method;
    }

    public final void checkout(double amount) {
        if (method != null) {
            method.initialise();
            method.pay(amount);
        } else {
            throw new NullPointerException("No payment method chosen.");
        }
    }

}
