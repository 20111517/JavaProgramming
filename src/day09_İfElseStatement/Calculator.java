package day09_İfElseStatement;

public class Calculator {

    public static void main(String[] args) {
        double n1=10.0;
        double n2=20.0;
        char operator='+';
        double result=30;
        if(operator=='+'){
            result=n1+n2;
        } else if (operator=='-') {
            result=n1-n2;
        } else if (operator=='*') {
            result=n1*n2;
        } else if (operator=='/') {
            result=n1/n2;
        }else;
        System.out.println(result);

    }





}