/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory;

/**
 *
 * @author DELL 7550
 */
public class IPhoneFactory implements PhoneFactory {

    @Override
    public Button createButton() {
        return new IPhoneButton();
    }

    @Override
    public Screen createScreen() {
        return new IPhoneScreen(); //Lol
    }

    private class IPhoneButton implements Button {

        @Override
        public String getManufacturer() {
            return "IPhone";
        }

        @Override
        public String press() {
            return "IPhone Music yay";
        }

    }

    public class IPhoneScreen implements Screen {

        @Override
        public String getManufacturer() {
            return "Samsung"; //lol
        }

        @Override
        public String getRepairCost() {
            return "Pricey for no reason";
        }

    }
}
