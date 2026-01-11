/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.Strategy.Duck;

/**
 *
 * @author DELL 7550
 */
public abstract class Duck {

    private QuackBehavior quackBehavior;

    public void display() {
        System.out.println("Hello, I'm a " + this.getClass().getSimpleName());
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
