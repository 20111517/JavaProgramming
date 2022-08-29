package OscarLiveReviev;

import java.sql.SQLOutput;
import java.util.Scanner;

public class week5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a valid website:");
        String website=scan.next();
        int firstDot=website.indexOf('.');
        int seconDot=website.lastIndexOf('.');
        boolean isValid=website.substring(0,firstDot).equals("www")&&(website.substring(seconDot+1).equals("com")||website.substring(seconDot+1)==("gov")||website.substring(seconDot+1)==("edu"));
        if(isValid){
            System.out.println("Valid website");
        }else{
            System.out.println("İnvalid website");
        }







    }












}
  /*
        Create a class named WebAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

         */