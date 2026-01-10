/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Builder.Cake;

/**
 *
 * @author DELL 7550
 */
public class Cake {

    private final double milk;
    private final double sugar;

    // constructor should be private to enforce object creation through builder
    private Cake(CakeBuilder builder) {
        this.milk = builder.milk;
        this.sugar = builder.sugar;
    }

    @Override
    public String toString() {
        return "Milk: " + String.valueOf(milk) + " cups; Sugar:" + String.valueOf(sugar) + " cups;";
    }

    public static class CakeBuilder {

        private double milk = 0.5d;
        private double sugar = 1d;

        public CakeBuilder milk(double cup) {
            this.milk = cup;
            return this;

        }

        public CakeBuilder sugar(double cup) {
            this.sugar = cup;
            return this;

        }

        // return fully built object
        public Cake build() {

            return new Cake(this);

        }
    }
}
