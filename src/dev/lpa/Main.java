package dev.lpa;

public class Main {

    public static String generatePattern(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder pattern = new StringBuilder();
        boolean isPlus = true;

        for (int i = 0; i < n; i++) {
            if (isPlus) {
                pattern.append("+");
            } else {
                pattern.append("-");
            }

            isPlus = !isPlus;
        }

        return pattern.toString();
    }

    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 8;

        String pattern1 = generatePattern(n1);
        String pattern2 = generatePattern(n2);

        System.out.println("Pattern for n=" + n1 + ": " + pattern1);
        System.out.println("Pattern for n=" + n2 + ": " + pattern2);
    }
}

