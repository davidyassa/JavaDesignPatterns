/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural123.Adapter.Object;

/**
 *
 * @author DELL 7550
 */
public class RoundToSquarePegAdapter extends SquarePeg {

    private RoundPeg roundPeg;

    public RoundToSquarePegAdapter(RoundPeg peg) {
        //the roundPeg is plugged into the adapter
        this.roundPeg = peg;
    }

    @Override
    public void insert(String str) {
        //the roundPeg can now be inserted in the same manner as a squarePeg!
        roundPeg.insertIntoHole(str);
    }
}
