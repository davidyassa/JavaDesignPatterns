/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.AbstractFactory;

/**
 *
 * @author DELL 7550
 */
public class FactoryProducer {

    public PhoneFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "samsung" -> {
                return new SamsungFactory();
            }
            case "iphone" -> {
                return new IPhoneFactory();
            }
            default ->
                throw new IllegalArgumentException("Brand not in contract");
        }
    }
}
