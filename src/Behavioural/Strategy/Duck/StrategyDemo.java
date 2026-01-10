/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural.Strategy.Duck;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class StrategyDemo extends Demo {

    public static void main(String[] args) {
        new StrategyDemo().run();
    }

    @Override
    public void run() {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.display();
        rubberDuck.performQuack();
        sep();
        Duck muteDuck = new MuteDuck();
        muteDuck.setQuackBehavior(new MuteQuack());
        muteDuck.display();
        muteDuck.performQuack();
    }
}
