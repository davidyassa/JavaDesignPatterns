/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

import Demo.Demo;

/**
 *
 * @author DELL 7550
 */
public class SingletonDemo extends Demo {

    public static void main(String[] args) {
        new SingletonDemo().run();
    }

    @Override
    public void run() {
        RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
        final int MAX = 10;

        for (int i = 0; i < MAX; i++) {
            System.out.println(rng.nextInt(10));    // 0..9
        }
        System.out.println();
        for (int i = 0; i < MAX; i++) {
            System.out.println(rng.nextDouble());   // 0.0..1.0
        }
        System.out.println();

        // Prove it's the same singleton instance:
        RandomNumberGenerator rng2 = RandomNumberGenerator.getInstance();
        System.out.println(rng == rng2);        // true
        System.out.println();

        // Optional: reproducible sequence
        rng.reseed(123);
        for (int i = 0; i < MAX; i++) {
            System.out.println(rng.nextInt(100));
        }
//        System.out.println(rng.nextInt(100));
    }

}
