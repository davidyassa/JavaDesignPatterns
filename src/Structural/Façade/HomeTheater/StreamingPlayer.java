/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Façade.HomeTheater;

/**
 *
 * @author DELL 7550
 */
public class StreamingPlayer {

    private static boolean paused = true;
    private static String recentlyPlayed = null;

    public void on() {
        System.out.println("StreamingPlayer on");
    }

    public void off() {
        System.out.println("StreamingPlayer off");
    }

    public void play(String movie) {
        if (paused) { //TV was off
            paused = false;
            System.out.println("Now Playing: " + movie);
            recentlyPlayed = movie;
        } else { //User was watching sth else
            System.out.println("Changing movie: " + movie);
            recentlyPlayed = movie;

        }
    }

    public void play() {
        if (hasRecent()) {
            play(recentlyPlayed);
        } else {
            System.out.println("No recent movies found.");
        }
    }

    public void togglePause() {
        if (!paused) {
            paused = true;
            System.out.println("Movie paused.");
        } else {
            paused = false;
            System.out.println("Movie resumed.");
        }
    }

    public void stop() {
        System.out.println("Stopped playing " + recentlyPlayed);
        paused = true;
    }

    public boolean hasRecent() {
        return recentlyPlayed != null;
    }

}
