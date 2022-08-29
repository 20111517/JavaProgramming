package day_16ForLoopandStringsPratctises;

public class Palindrome {
    public static void main(String[] args) {
        String str="racecar";
        String result="";
        for (int i =str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(result)){
            System.out.println("Palendrome");
        }else{
            System.out.println("is not Planedrome");
        }
    }






}
