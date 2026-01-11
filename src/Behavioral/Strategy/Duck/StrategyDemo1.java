/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.Strategy.Duck;

import Demo.Demo;

/**
 *
 * @author DELL 7550
 */
public class StrategyDemo1 extends Demo {

    public static void main(String[] args) {
        new StrategyDemo1().run();
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
