/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author DELL 7550
 */
//ClassicSingleton class updated by ChatGPT
public final class ImprovedSingleton {

    // 1) Private constructor: exists only to defeat instantiation
    private ImprovedSingleton() {
    }

    // 2) Lazy + thread-safe initialization:
    //    The JVM loads Holder only when getInstance() is first called.
    private static class Holder {

        private static final ImprovedSingleton INSTANCE = new ImprovedSingleton();
    }

    public synchronized static ImprovedSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
