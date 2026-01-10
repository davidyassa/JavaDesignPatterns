/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.Factory;

/**
 *
 * @author DELL 7550
 */
public interface Shape {

    default String getName() {
        return this.getClass().getSimpleName();
    }

    int getNumSides();

    String draw();
}
