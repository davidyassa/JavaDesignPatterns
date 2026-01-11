/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioral.ChainOfResponsibility;

/**
 *
 * @author DELL 7550
 */
public interface Chain {

    public abstract void setNext(Chain nextInChain);

    public abstract void process(int request);
}
