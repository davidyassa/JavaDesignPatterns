/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.ChainOfResponsibility;

import Demo.Demo;

/**
 *
 * @author DELL 7550
 */
public class ChainDemo extends Demo {

    public static void main(String[] args) {
        new ChainDemo().run();
    }

    @Override
    public void run() {
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();
//        Chain c4 = new SuccessProcessor(); 
//first catch is one of the first three, so c4 won't ever get called
        c1.setNext(c2);
        c2.setNext(c3);
//        c3.setNext(c4);

        //calling chain of responsibility 
        c1.process(99);
        c1.process(-30);
        c1.process(0);
        c1.process(61);
    }
}
