package day11_switch_Scanner;

public class Numberofdays {
    public static void main(String[] args) {
        int year=2002;
        int number=2;
        String result="";
        if(number>=1&&number<=12) {
        switch(number){
            case 1: case 3 : case 5: case 7: case 8: case 12:
                result="31 days";
                break;
            case 2:
            result=(year%4==0)?"29 days":"28 days";
            break;
            default:
                result="30 days";

        }

        }else{
           result="İnvalid NUmber";
            }

        System.out.println(result);











    }











}
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */