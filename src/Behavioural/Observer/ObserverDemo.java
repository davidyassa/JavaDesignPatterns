/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural.Observer;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class ObserverDemo extends Demo {

    public static void main(String[] args) {
        new ObserverDemo().run();
    }

    @Override
    public void run() {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
