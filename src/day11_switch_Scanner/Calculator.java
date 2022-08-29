package day11_switch_Scanner;

import java.lang.management.OperatingSystemMXBean;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 11.5, n2 = 12.5;
        char operators = '*';

        boolean validoperators = (operators == '+' || operators == '-' || operators == '*' || operators == '/');

        if (validoperators) {
            switch (operators) {
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;

                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);

            }
        }else{
            System.out.println("İnvalid operators");

            }



        }
    }






/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		            @
 */