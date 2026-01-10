/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author DELL 7550
 */
public class ClassicSingleton {

    private static ClassicSingleton instance = null;
    private static Object syncObject; // to synchronize a block

    private ClassicSingleton() {
        /*exists only to defeat instantiation*/
    }

    public static ClassicSingleton getInstance() {

        synchronized (syncObject) {
            if (instance == null) {
                instance = new ClassicSingleton();
            }
        }

        return instance;
    }
}
