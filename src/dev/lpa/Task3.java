package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static int[] generateArray(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Input must be between 1 and 100");
        }

        int[] result = new int[n];
        Random rand = new Random();


        for (int i = 0; i < n - 1; i++) {
            result[i] = rand.nextInt(101);
        }

        result[n - 1] = -Arrays.stream(result).sum();

        return result;
    }

    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 3;

        int[] generatedArray1 = generateArray(n1);
        int[] generatedArray2 = generateArray(n2);

        System.out.println("Generated array for n=" + n1 + ": " + Arrays.toString(generatedArray1));
        System.out.println("Generated array for n=" + n2 + ": " + Arrays.toString(generatedArray2));
    }
}
