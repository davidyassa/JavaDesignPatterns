/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author DELL 7550
 */
public abstract class Demo implements Runnable {

    @Override
    public abstract void run();

    public static void dotsLoop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(".");
            try {
                java.lang.Thread.sleep((long) 1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

//      ↓↓↓↓  At this point it's a utility class  ↓↓↓↓
    public static void clearScreen() {
        String os = System.getProperty("os.name");

        try {
            if (os.startsWith("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (java.io.IOException | InterruptedException e) {
            // Fallback for terminals that support ANSI escape codes
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void buffer() {
        System.out.print("Press Enter to continue...");
        try {
            while (System.in.read() != '\n') { // wait for Enter
            }
        } catch (java.io.IOException ignore) {
        }
    }

    public static void sep() {
        final String dash = "\n---------------------------------------------\n";
        System.out.print(dash);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
