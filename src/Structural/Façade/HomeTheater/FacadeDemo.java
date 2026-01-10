/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Façade.HomeTheater;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class FacadeDemo extends Demo {

    public static void main(String args[]) {
        new FacadeDemo().run();
    }

    @Override
    public void run() {
        Theater bedroom = new HomeTheater();
        bedroom.watchMovie("Spiderman 2");
        sep();
        bedroom.endMovie();
        sep();
        bedroom.watchMovie(null);
        sep();
        bedroom.watchMovie("Avengers: Endgame");
        sep();
        bedroom.endMovie();
        sep();
    }

    public static void sep() {
        final String dash = "---------------------------------------------";
        System.out.println(dash);
    }

}
