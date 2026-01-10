/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class PrototypeDemo extends Demo {

    public static void main(String[] args) {
        new PrototypeDemo().run();
    }

    @Override
    public void run() {
// Get the start time
        long startTime = System.currentTimeMillis();
        Board chessBoard = new Board();
        // Get the end time
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create a board: " + (endTime - startTime) + " millis");
        // Print the board
        chessBoard.print();

        // Get the start time
        startTime = System.currentTimeMillis();
        // Clone the object
        Board checkersBoard = (Board) chessBoard.clone();
        // Get the end time
        endTime = System.currentTimeMillis();

        System.out.println("Time taken to clone a board: " + (endTime - startTime) + " millis");
        checkersBoard.print();
    }
}
