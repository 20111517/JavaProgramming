package day14_String;

public class StringMethod4 {

    public static void main(String[] args) {

        String word="I love you ";
        word=word.toUpperCase();
        word=word.substring(word.indexOf("Y"));
        String Word1=word.repeat(5);
        System.out.println("Word1 = " + Word1);

        System.out.println("nice day\n".repeat(5));
        String name="Java";
        System.out.println((name+" ") .repeat(5));
    }



}
