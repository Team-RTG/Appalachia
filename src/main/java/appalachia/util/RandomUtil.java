package appalachia.util;

import javax.annotation.Nonnull;
import java.util.Random;

public class RandomUtil {

    public static int getRandomInt(int intStart, int intEnd) {

        return (int)((Math.random() * intEnd) + intStart);
    }

    public static int getRandomInt(@Nonnull Random rand, int intStart, int intEnd) {

        return intStart + rand.nextInt(intEnd - intStart + 1);
    }

    /**
     * Gets a Positive Gaussian Number with derivation and adds that to min.
     * @param rand A Random Number Generator.
     * @param min The minimum outcome.
     * @param derivation The derivation value. This is not the maximal outcome!
     * @return A Pseudo-Random number strongly biased towards min
     */
    public static double weightedRandom(@Nonnull Random rand, double min, double derivation) {
        return min + Math.abs(rand.nextGaussian()) * derivation;
    }
}