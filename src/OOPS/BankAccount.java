package OOPS;
import java.util.Scanner;
class Account{
    long ac_no;
    double balance;
    Account(long ac_no, double balance){
        this.ac_no = ac_no;
        this.balance = balance;
    }
    void deposit(double add) {
        this.balance += add;
    }
    void withdraw(double remove){
        if(remove <= balance) balance -= remove;
        else System.out.println("Insufficient balance");
    }
    void display(){
        System.out.println("Account number: " + this.ac_no + "\nFinal amount: " + this.balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account number: ");
        long an = sc.nextLong();
        System.out.print("Enter Initial balance: ");
        double balance = sc.nextDouble();
        Account a1 = new Account(an,balance);
        System.out.print("Enter deposit amount: ");
        double add = sc.nextDouble();
        a1.deposit(add);
        System.out.print("Enter withdraw amount: ");
        double remove = sc.nextDouble();
        if(a1.balance <= 1000) System.out.println("Insufficient balance !");
        else a1.withdraw(remove);
        a1.display();
    }
}
