package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {
        String word="I love playing football,but I had an ınjury";
        word=word.replace("I","you");
        word=word.replace("football","basketball");
        System.out.println("word = " + word);
        String sentence="java java python python python python c# c# c# c++ c++ c++";
        sentence=sentence.replace("python","");
        System.out.println("sentence = " + sentence);
        sentence=sentence.replace("    ","");
        System.out.println("sentence = " + sentence);
        sentence=sentence.replace("c","d");
        System.out.println("sentence = " + sentence);
        sentence=sentence.replaceFirst("d#","c#");
        System.out.println("sentence = " + sentence);
    }



}
