package day07_OIperators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean result1 =  200 > 40; // true

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150 ; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; //true

        System.out.println("result3 = " + result3);

        boolean result4 =  300 >= 500; // false

        System.out.println("result4 = " + result4);


        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater, then it's eligible for the loan

        int x = 100;
        int y = 200;

        boolean equal =   x == y; // false
        //               100 == 200

        System.out.println("equal = " + equal);

        boolean result8 =   "Muhtar" == "Good Guy" ; // false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; // false

        System.out.println("result9 = " + result9);

        boolean result10 =  "Java" == "Java"; // true
        System.out.println("result10 = " + result10);


        boolean result11 =  100 != 200.5; //true
        System.out.println("result11 = " + result11);

        boolean result12 =  "Java" != "Break"; // true
        System.out.println("result12 = " + result12);

        boolean result13 =   300 != 300; // false
        System.out.println("result13 = " + result13);










    }







}
