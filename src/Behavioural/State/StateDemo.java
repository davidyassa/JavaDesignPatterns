/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural.State;

import Resources.Demo;
import static java.lang.Thread.sleep;

/**
 *
 * @author DELL 7550
 */
public class StateDemo extends Demo {

    public static void main(String[] args) {
        new StateDemo().run();
    }

    @Override
    public void run() {
        Context context = new Context();

        // Start from RED
        context.setState(new RedLightState());

        // Execute 3 transitions: RED -> GREEN -> YELLOW
        for (int i = 0; i < 10; i++) {
            long millis = 1000;
            context.execute();
            try {
                sleep(millis);
            } catch (InterruptedException ex) {
                System.getLogger(StateDemo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }

}
