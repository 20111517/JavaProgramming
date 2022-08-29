package day_18NestedLoops;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
            System.out.print(count);

        }



    }
}