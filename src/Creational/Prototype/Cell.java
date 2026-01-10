/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Prototype;

/**
 *
 * @author DELL 7550
 */
public class Cell implements Cloneable {

    private String color;

    public Cell(String color) {
        this.color = color;

        try {
            Thread.sleep(100); // Make it time consuming task.
        } catch (InterruptedException e) {
        }
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color.substring(0, 1);
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
//In this code, Thread.sleep is used to make the object creation as a time consuming operation.
