/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Builder.Pizza;

/**
 *
 * @author DELL 7550
 */
public abstract class PizzaBuilder {

    private Pizza pizza;

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
}
