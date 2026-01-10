/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Creational.AbstractFactory;

/**
 *
 * @author DELL 7550
 */
public interface Button {

    String getManufacturer();

    String press();

    default void printDeets() {
        System.out.println("Made by: " + getManufacturer() + "\nPressing...\t" + press());

    }
}
