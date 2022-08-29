package day04_Veriables;

import javax.lang.model.SourceVersion;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyrate,Weeklyhours
        int hourlyRate =65;
        int weeklyHours =45;
        int numberofweek =52;
        int salary =hourlyRate * weeklyHours * numberofweek;

       // System.out.println(salary();
        System.out.println("hourlyRate = $ " + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberofweek = " + numberofweek);
        System.out.println("salary = $ " + salary);

    }



}
