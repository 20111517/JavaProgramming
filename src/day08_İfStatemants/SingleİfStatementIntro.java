package day08_İfStatemants;

public class SingleİfStatementIntro {

    public static void main(String[] args) {
        int number = 101;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */



        if(number%2==0){ // false
            System.out.println("Even Number");
        }

        if(number%2==1){// true
            System.out.println(" odd number");
        }


        System.out.println("--------------------------------");

        int n = 200;

        // positive
        if(n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n+" is positive");
        }

        // negative
        if(n < 0){ // if n is less than zero, then it's negative
            System.out.println(n+" is negative");
        }

        // zero
        if(n == 0) {
            System.out.println(n + " is zero");
        }




    }







}
