/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Builder.Cake;

import Demo.Demo;

/**
 *
 * @author DELL 7550
 */
public class BuilderDemo extends Demo {

    public static void main(String args[]) {
        new BuilderDemo().run();
    }

    @Override
    public void run() {
        Cake cake1 = new Cake.CakeBuilder().sugar(1).build();
        Cake cakeSugary = new Cake.CakeBuilder().sugar(67).milk(2).build();
        // Create the object using builder pattern
        System.out.println(cake1);
        System.out.println(cakeSugary);
    }

}
