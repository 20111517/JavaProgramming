package day13_String;

public class StringMethods {

    public static void main(String[] args) {
        String word =  "Cydeo";
        //index:   01234

        char thirdChar = word.charAt(2);
        char fourthChar=word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("------------------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(  s1.length()-1  );  // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON"

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);
        System.out.println("..................................................");
        String word1="Total Character";
         word1=word1.toUpperCase();
        System.out.println(word1);
       int totalchar=word1.length();
       char seventh=word1.charAt(6);
       char lastchar=word1.charAt(word1.length()-1);
        System.out.println("totalchar = " + totalchar);
        System.out.println("lastchar = " + lastchar);
        System.out.println("seventh = " + seventh);



    }







}
