/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Façade.HomeTheater;

/**
 *
 * @author DELL 7550
 */
public class HomeTheater implements Theater {

    private final Lights lights = new Lights();
    private final Projector projector = new Projector();
    private final SoundSystem sound = new SoundSystem();
    private final StreamingPlayer player = new StreamingPlayer();

    @Override
    public void watchMovie(String movie) {
        lights.dim(10);
        projector.on();
        projector.setInput("HDMI");
        sound.on(7);
        player.on();
        if (movie == null) {
            player.play();
        } else {
            player.play(movie);
        }
    }

    @Override
    public void endMovie() {
        player.stop();
        player.off();
        projector.off();
        sound.off();
        lights.on();
    }
}

/*
watchMovie(...) must do (in order):

dim lights to 10%
turn on projector + set input to "HDMI"
turn on sound system + set volume to 7
turn on streaming player + play the movie


endMovie() must do (in order):

stop streaming player + turn it off
turn off projector
turn off sound system
turn lights on

 */
