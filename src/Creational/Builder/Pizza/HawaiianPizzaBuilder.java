/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Builder.Pizza;

/**
 *
 * @author DELL 7550
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        getPizza().setDough("cross");
    }

    @Override
    public void buildSauce() {
        getPizza().setSauce("mild");
    }

    @Override
    public void buildTopping() {
        getPizza().setTopping("ham+pineapple");
    }

}
