/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Façade.HomeTheater;

/**
 *
 * @author DELL 7550
 */
public class Lights {

    public void on() {
        System.out.println("Lights on at 75%");
    }

    public void on(int percent) {
        System.out.println("Lights on at " + percent + "%");
    }

    public void dim(int percent) {
        if (percent <= 100 && percent >= 0) {
            System.out.println("Lights now at " + percent + "%");
        }
    }
}
