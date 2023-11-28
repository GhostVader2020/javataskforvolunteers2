package dev.lpa;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("the sum of the numbers in the array is " +
                calcSumArray(new int[]{0,1,2,3,4}));

    }
    public static int calcSumArray(int[]arr){
        int result = 0;
        for (int i=0; i< arr.length; i++){
            result += arr[i];
        }
        return  result;
    }
}
