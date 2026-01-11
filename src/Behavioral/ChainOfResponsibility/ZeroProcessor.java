/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.ChainOfResponsibility;

/**
 *
 * @author DELL 7550
 */
public class ZeroProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        nextInChain = c;
    }

    @Override
    public void process(int request) {
        if (request == 0) {
            System.out.println("ZeroProcessor : " + request);
        } else {
            nextInChain.process(request);
        }
    }
}
