package day12_Scanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your fullname:");
        String fullName=scan.nextLine();
        System.out.println("Enter your gpa:");
        double gpa= scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your school name:");
        String schoolName=scan.nextLine();



        System.out.println("age = " + age);;
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }


}
