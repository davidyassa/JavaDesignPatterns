/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

/**
 *
 * @author DELL 7550
 */
public abstract class Demo implements Runnable {

    @Override
    public abstract void run();
    public static void sep() {
        final String dash = "---------------------------------------------";
        System.out.println(dash);
    }
}
//For Later if I wanna add a menu for testing the patterns
