/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.State;

/**
 *
 * @author DELL 7550
 */
public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void execute() {
        state.doAction(this);
    }
}
