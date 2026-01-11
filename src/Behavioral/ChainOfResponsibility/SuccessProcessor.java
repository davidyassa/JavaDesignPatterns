/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.ChainOfResponsibility;

/**
 *
 * @author DELL 7550
 */
public class SuccessProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(int request) {
        if (request > 60) {
            System.out.println("SuccessProcessor : " + request);
        } else {
            nextInChain.process(request);
        }
    }
}
