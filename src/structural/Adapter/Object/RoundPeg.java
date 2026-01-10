/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Adapter.Object;

import Structural.Adapter.Class.IRoundPeg;

/**
 *
 * @author DELL 7550
 */
public class RoundPeg implements IRoundPeg {

    @Override
    public void insertIntoHole(String msg) {
        System.out.println("RoundPeg insertIntoHole(): " + msg);
    }
}
