/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.State;

/**
 *
 * @author DELL 7550
 */
public class RedLightState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Red Light - Stop");
        context.setState(new GreenLightState());

    }

    @Override
    public String getName() {
        return "RED";
    }
}
