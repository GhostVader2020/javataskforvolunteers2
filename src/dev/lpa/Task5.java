package dev.lpa;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar( "Test1"));

    }
    public static String repFirstChar(String s){
        char c = s.charAt(0);
        if (Character.isUpperCase(c)){
            return "upper";
        }else if (Character.isLowerCase(c)){
            return "lower";
        }else if (Character.isDigit(c)){
            return "digit";
        }else{
            return "other";
        }
    }
}
