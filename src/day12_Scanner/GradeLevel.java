package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your quiz note");
        int quiznote = input.nextInt();
        System.out.println("show your result");
        String result = input.nextLine();

        if (quiznote >= 80 && quiznote <= 100) {
            result = "A GRADE LEVEL";
        } else if (quiznote >= 60 && quiznote <= 79) {
            result = "B GRADE LEVEL";
        } else if (quiznote >= 40 && quiznote <= 59) {
            result = "C GRADE LEVEL";
        } else {
            result = "invalid Grade Level";
            System.out.println("result = " + result);


        }
    }
}