/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Behavioral.Strategy.Payment;

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
        if (method == null) {
            throw new IllegalStateException("No payment method chosen.");
        }
        method.initialise();
        method.pay(amount);
    }

}
