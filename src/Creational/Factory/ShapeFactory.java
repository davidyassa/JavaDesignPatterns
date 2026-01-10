/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Factory;

/**
 *
 * @author DELL 7550
 */
public class ShapeFactory {

    public Shape getShape(String shape) {
        switch (shape.toLowerCase()) {
            case "circle" -> {
                return new Circle();
            }
            case "square" -> {
                return new Square();
            }
            case "triangle" -> {
                return new Triangle();
            }
            default -> {
                throw new IllegalArgumentException("Shape out of Stock!");
            }
        }
    }

    private class Circle implements Shape {

        @Override
        public int getNumSides() {
            return -1;
        }

        @Override
        public String draw() {
            return "Circle!";
        }
    }

    private class Square implements Shape {

        @Override
        public int getNumSides() {
            return 4;
        }

        @Override
        public String draw() {
            return "Square!";
        }
    }

    private class Triangle implements Shape {

        @Override
        public int getNumSides() {
            return 3;
        }

        @Override
        public String draw() {
            return "Triangle!";
        }
    }

}
