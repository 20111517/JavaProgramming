package day_15Loop;

public class StringMethods1 {
    public static void main(String[] args) {
        String str="    ";
        boolean r=str.isEmpty();
        System.out.println(r);
        boolean r1=str.isBlank();
        System.out.println(r1);

        System.out.println("..........................................");
        String str2="Cydeo   ";
        str2=str2.repeat(5);
        System.out.println(str2);

       String s1="Mustafa";
       String s2="mUsTaFA";
       boolean s3=s1.equals(s2);
        System.out.println(s3);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("yEs".equalsIgnoreCase("YES"));

        String sentence="My favorite programming language is Java";

        boolean hasCsharp=sentence.contains("C#");
        boolean hasJava =sentence.contains("Java");
        boolean hasjava =sentence.contains("java");
        boolean hasJAVA4=sentence.contains("JAVA");
        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasjava);
        System.out.println(hasJAVA4);

        String input1="I love Java";
        String input2="Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.contains(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.toUpperCase().contains("JAVA"));
        System.out.println(input1.toLowerCase().contains("java"));

        String a="Wooden Spoon";
        boolean x=a.startsWith("wO");
        boolean y=a.endsWith("on");

    }






}
