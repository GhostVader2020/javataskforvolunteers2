package dev.lpa;

import java.util.Arrays;
public class Task4 {

    public static int findLargestSibling(int n) {

        String nStr = Integer.toString(n);

        char[] digits = nStr.toCharArray();

        Arrays.sort(digits);
        reverseArray(digits);

        int result = Integer.parseInt(new String(digits));

        return result;
    }

    private static void reverseArray(char[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int n1 = 213;
        int n2 = 553;

        int largestSibling1 = findLargestSibling(n1);
        int largestSibling2 = findLargestSibling(n2);

        System.out.println("Largest sibling for n=" + n1 + ": " + largestSibling1);
        System.out.println("Largest sibling for n=" + n2 + ": " + largestSibling2);
    }
}

