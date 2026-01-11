/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Facade.HomeTheater;

/**
 *
 * @author DELL 7550
 */
public class SoundSystem {

    public void on() {
        System.out.println("SoundSystem on");
    }

    public void on(int v) {
        System.out.println("SoundSystem on, Volume at " + v + "/10");
    }

    public void off() {
        System.out.println("SoundSystem off");
    }

    public void setVolume(int v) {
        if (v <= 10 && v >= 0) {
            System.out.println("SoundSystem Volume at " + v + "/10");
        }
    }
}
