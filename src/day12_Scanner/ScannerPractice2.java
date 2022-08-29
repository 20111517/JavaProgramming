package day12_Scanner;
import java.util.Scanner;
public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = "";
        System.out.println("Enter your name:");
        String name = scan.next();
        if (name.equals("Mustafa")) {
            result = "True";
        } else {
            result = "False";

        }
        System.out.println(result);
    scan.close();
    }



}
