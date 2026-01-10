/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory;

/**
 *
 * @author DELL 7550
 */
public class SamsungFactory implements PhoneFactory {

    @Override
    public Button createButton() {
        return new SamsungButton();
    }

    @Override
    public Screen createScreen() {
        return new SamsungScreen();
    }

    private class SamsungButton implements Button {

        @Override
        public String getManufacturer() {
            return "Samsung";
        }

        @Override
        public String press() {
            return "Galaxy Music yay";
        }

    }

    public class SamsungScreen implements Screen {

        @Override
        public String getManufacturer() {
            return "Samsung";
        }

        @Override
        public String getRepairCost() {
            return "Affordable";
        }

    }
}
