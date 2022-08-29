package DAY_31Constructors;

public class BankAccount {

public String acoountHolder;
public int accountNumber;
public double balance;

    public void setInfo(String acoountHolder, int accountNumber, double balance) {
        this.acoountHolder = acoountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "acoountHolder='" + acoountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
    public void checkBalance(){
        System.out.println("your avalible balance is :"+balance);
    }






}

