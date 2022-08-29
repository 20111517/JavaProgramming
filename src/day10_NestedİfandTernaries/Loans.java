package day10_NestedİfandTernaries;

public class Loans {
    public static void main(String[] args) {
        int salary = 50000,
                creditScore = 550;
        String result = "";
        if (salary >= 60000 && creditScore >= 650) {
            result = "Loan Approved";
        } else {
            result = "Loan Denied";
        }

        System.out.println("result = " + result);
    }
    }
/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.
                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise, print: "Loan Denied"
              NOTE: MUST USE TERNARY.
 */







