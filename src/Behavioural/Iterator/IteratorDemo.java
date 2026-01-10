/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural.Iterator;

import Resources.Demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DELL 7550
 */
public class IteratorDemo extends Demo {

    public static void main(String[] args) {
        new IteratorDemo().run();
    }

    @Override
    public void run() {
        // The Client code
        List<BankAccount> bank = new ArrayList<>();
        bank.add(new BankAccount("C100", 100.5));
        bank.add(new BankAccount("C101", 2000));
        bank.add(new BankAccount("C102", 2000));
        //...
        bank.add(new BankAccount("V29", 9000000));

        Iterator<BankAccount> itr = bank.iterator();
        String searchID = "C101";
        boolean found = false;
        while (itr.hasNext()) {
            System.out.println("Searching...");
            if (itr.next().getID().equals(searchID)) {
                System.out.println("Found!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found!");
        }
    }

}
