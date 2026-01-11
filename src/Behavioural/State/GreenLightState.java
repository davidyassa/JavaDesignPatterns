/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural.State;

/**
 *
 * @author DELL 7550
 */
public class GreenLightState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Green Light - Go");
        context.setState(new YellowLightState());

    }

    @Override
    public String getName() {
        return "GREEN";
    }
}
