package day11_switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade='A';
       String result ="";
    switch(grade){
        case'A':
            result="Excellent";
            break;
        case'B':
            result="great";
            break;
        case'C':
            result="good";
            break;
        case'D':
            result="Passed";
            break;
        default:
            result="failed";

    }


        System.out.println(result);






    }
















}
/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */
