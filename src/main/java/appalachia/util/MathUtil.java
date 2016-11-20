package appalachia.util;

import java.util.Random;

public class MathUtil {
    /**
     * Gets a Positive Gausian Number with derrivation and adds that to min.
     * @param rand A Random Number Generator.
     * @param min The minimum outcome.
     * @param derivation The derrivation value. This is not the maximal outcome!
     * @return A Pseudo-Random number
     */
    public static double weightedRandom(Random rand, double min, double derivation) {
        return min + Math.abs(rand.nextGaussian()) * derivation;
    }
}
