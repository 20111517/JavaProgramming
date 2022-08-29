package day11_switch_Scanner;

import java.lang.invoke.SwitchPoint;

public class grade2 {
    public static void main(String[] args) {
        char grade2='A';
        String result="";
        switch (grade2){

            case 'A': case'B': case'C': case'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="İnvalid Grade2";



        }
        System.out.println(result);




    }









}
/*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"
 */