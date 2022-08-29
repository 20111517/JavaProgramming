package day09_İfElseStatement;

public class NumberToWord {

    public static void main(String[] args) {
        int number = 1;
        String word;
        if (number == 0) {
            word = "zero";
        }
        if (number == 1) {
            word = "one";
        } else if (number == 2) {
            word = "two";
        } else if (number == 3) {
            word = "three";
        } else if (number == 4) {
            word = "four";
        } else if (number == 5) {
            word = "fife";
        } else if (number == 6) {
            word = "six";
        } else if (number == 7) {
            word = "seven";
        } else if (number == 8) {
            word = "eight";
        } else {
            word = "nine";
        }

        System.out.println("Word is =" + word);
    }
}