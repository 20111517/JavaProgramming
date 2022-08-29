package day_16ForLoopandStringsPratctises;

public class Reverse {

    public static void main(String[] args) {
        String str="Mustafa Şahin";
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }

        System.out.println(result);

        String word="Galatasaray is the best team of the Turkey";
        String result1="";
        for (int i = word.length()-1; i >=0 ; i--) {

                result1 += word.charAt(i);
        }
        System.out.println(result1);

        String name="KAYAK";
        String result2="";
        for (int i = name.length()-1; i >=0 ; i--) {
                result2 += name.charAt(i);}
            if (name.equalsIgnoreCase(result2)) {
                System.out.println(result2 = "Palendrome");
            } else {
                System.out.println(result2 = "is not Palendrome");
            }

        }








    }









