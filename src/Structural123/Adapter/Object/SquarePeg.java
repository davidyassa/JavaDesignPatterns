/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural123.Adapter.Object;

import Structural123.Adapter.Class.ISquarePeg;

/**
 *
 * @author DELL 7550
 */
public class SquarePeg implements ISquarePeg {

    @Override
    public void insert(String str) {
        System.out.println("SquarePeg insert(): " + str);
    }
}
