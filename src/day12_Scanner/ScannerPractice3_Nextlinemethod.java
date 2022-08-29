package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_Nextlinemethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your fullname:");
        String fullName=scan.nextLine();
        System.out.println("Enter your programming Language:");
        String ProgrammingLanguage=scan.nextLine();
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your school name:");
        String Schoolname=scan.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("ProgrammingLanguage = " + ProgrammingLanguage);
        System.out.println("age = " + age);
        System.out.println("Schoolname = " + Schoolname);
        scan.close();
    }




}
