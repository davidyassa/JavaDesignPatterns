/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural123.Adapter.Class;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class AdapterDemo2 extends Demo {

    public static void main(String args[]) {
        new AdapterDemo2().run();
    }

    @Override
    public void run() {
        RoundPeg roundPeg = new RoundPeg();
        roundPeg.insertIntoHole("I am a RoundPeg into a round hole.");
        SquarePeg squarePeg = new SquarePeg();
        squarePeg.insert("I am a SquarePeg into a square hole.");
        
        // Create a two-way adapter and do an insert with it.
        ISquarePeg wannabeRound = new PegAdapter(roundPeg);
        wannabeRound.insert("I am a SquarePeg into a round hole!");
        
        IRoundPeg wannabeSquare = new PegAdapter(squarePeg);
        wannabeSquare.insertIntoHole("I am a RoundPeg into a square hole!");
    }
}
