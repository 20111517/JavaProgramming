package day14_String;

public class StringMethod3_Substring {

    public static void main(String[] args) {
        String word="Cydeo School";
        String s1=word.substring(0,word.indexOf(" "));
        String s2=word.substring(word.indexOf(" "));
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("...................................");
        String name="Mustafa Şahin";
       String name2=name.substring(0,name.indexOf("a ")+1);
        System.out.println("name2 = " + name2);
       String name1=name.substring(name.indexOf("a ")+1);
        System.out.println("name1 = " + name1);
   String sentence="Learning Software Programming";
   String sentence1=sentence.substring(0,sentence.indexOf("g")+1);
        System.out.println("sentence = " + sentence1);
    String sentence2=sentence.substring(sentence.indexOf("g")+1,sentence.indexOf("e ")+1);
        System.out.println("sentence2 = " + sentence2);
    String sentence3=sentence.substring(sentence.indexOf("P"));
        System.out.println("sentence3 = " + sentence3);


    }





}
