package dev.lpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static int[] generateArray(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Input must be between 1 and 100");
        }


        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i - n / 2;
        }


        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);


        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] generatedArray = generateArray(n);

        System.out.println("Generated array for n=" + n + ": " + Arrays.toString(generatedArray));
    }
}

