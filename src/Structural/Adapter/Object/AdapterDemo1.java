/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Adapter.Object;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class AdapterDemo1 extends Demo {

    public static void main(String args[]) {
        new AdapterDemo1().run();
    }

    @Override
    public void run() {
        // Create some pegs.
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();
        // Do an insert using the square peg.
        squarePeg.insert("Inserting square peg...");
        RoundToSquarePegAdapter adapter = new RoundToSquarePegAdapter(roundPeg);
        adapter.insert("Inserting round peg...");
    }
}
