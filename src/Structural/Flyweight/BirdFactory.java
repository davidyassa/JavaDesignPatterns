/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Flyweight;

import java.util.HashMap;

/**
 *
 * @author DELL 7550
 */
public class BirdFactory {

    //Hashmap<String color,Bird bird>
    private static final HashMap<String, Bird> angryBirdMap = new HashMap<>();

    public static Bird getAngryBird(String color) {
        AngryBird angrybird = (AngryBird) angryBirdMap.get(color);
        if (angrybird == null) {
            angrybird = new AngryBird(color);
            angryBirdMap.put(color, angrybird);
            System.out.println("Creating [" + color + "] Angry Bird ");
        }
        return angrybird;
    }
}
