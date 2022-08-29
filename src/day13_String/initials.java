package day13_String;
import java.util.Scanner;
public class initials {


    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstname=scan.next();
        System.out.println("enter your last name:");
        String lastname=scan.next();

        char f=firstname.charAt(0);
        char l=lastname.charAt(0);
        String initials=f+"."+l;
        System.out.println("initials = " + initials);

    }

    }