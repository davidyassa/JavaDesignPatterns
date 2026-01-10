/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural.Proxy;

import Resources.Demo;

/**
 *
 * @author DELL 7550
 */
public class ProxyDemo extends Demo { //Client class

    public static void main(String[] args) {
        new ProxyDemo().run();
    }

    @Override
    public void run() {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
