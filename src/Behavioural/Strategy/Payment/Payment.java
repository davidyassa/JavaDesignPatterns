/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Behavioural.Strategy.Payment;

/**
 *
 * @author DELL 7550
 */
public interface Payment {

    public default void initialise() {
        System.out.println("Initialising " + getClass().getSimpleName());
    }

    public void pay(double amount);
}
