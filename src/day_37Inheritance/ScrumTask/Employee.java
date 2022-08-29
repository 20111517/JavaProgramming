package day_37Inheritance.ScrumTask;

public class Employee extends Person {
    public String jobTitle, companyName;
    public int ıd;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, String companyName, int ıd, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.ıd = ıd;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", ıd=" + ıd +
                ", salary=" + salary +
                '}';
    }

    public void work() {
        System.out.println(jobTitle+" "+name+" "+"is working.");

    }
}