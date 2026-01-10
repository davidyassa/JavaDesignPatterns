/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural123.Adapter.Class;

import Structural123.Adapter.Object.RoundPeg;
import Structural123.Adapter.Object.SquarePeg;

/**
 *
 * @author DELL 7550
 */
/**
 * The PegAdapter class. This is a two-way adapter class.
 */
public class PegAdapter implements ISquarePeg, IRoundPeg {

    private RoundPeg roundPeg;
    private SquarePeg squarePeg;

    public PegAdapter(RoundPeg peg) {
        this.roundPeg = peg;
    }

    public PegAdapter(SquarePeg peg) {
        this.squarePeg = peg;
    }

    @Override
    public void insert(String str) {
        roundPeg.insertIntoHole(str);
    }

    @Override
    public void insertIntoHole(String msg) {
        squarePeg.insert(msg);
    }
}
