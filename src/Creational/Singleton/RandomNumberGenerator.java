/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Singleton;

/**
 *
 * @author DELL 7550
 */
import java.util.Random;

/**
 *
 * @author DELL 7550
 */
// RandomNumberGenerator implemented as a Holder-style Singleton
public final class RandomNumberGenerator {

    // 1) The actual RNG object we reuse
    private final Random random = new Random();

    // 2) Private constructor: prevents external instantiation
    private RandomNumberGenerator() {
    }

    // 3) Lazy + thread-safe singleton instance creation via class loading
    private static class Holder {

        private static final RandomNumberGenerator INSTANCE = new RandomNumberGenerator();
    }

    public static RandomNumberGenerator getInstance() {
        return Holder.INSTANCE;
    }

    // Example API methods:
    /**
     * @bound
     * @param bound Returns a random int in range [0, bound).
     */
    public int nextInt(int bound) {
        return random.nextInt(bound);
    }
    public int nextInt() {
        return random.nextInt();
    }

    /**
     * @return Returns a random double in range [0.0, 1.0).
     */
    public double nextDouble(double bound) {
        return random.nextDouble(bound);
    }
    public double nextDouble() {
        return random.nextDouble();
    }

    /**
     * Optionally reseed (useful for reproducible sequences).
     */
    public void reseed(long seed) {
        random.setSeed(seed);
    }
}
