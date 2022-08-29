package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius= input.nextInt();
        double perimeter=  (2*3.14*radius);
        double area=radius*radius*3.14;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        input.close();



    }




}
