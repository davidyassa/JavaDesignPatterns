/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Flyweight;

import Demo.Demo;

/**
 *
 * @author DELL 7550
 */
public class FlyweightDemo extends Demo {

    private static final String colors[] = {"Red", "Orange", "Blue", "Yellow", "Pink"};

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)]; //[0.0 ; 1.0] * 5
    }

    public static void main(String[] args) {
        new FlyweightDemo().run();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; ++i) {
            Bird angryBird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());
            angryBird.draw();
        }
    }
}
