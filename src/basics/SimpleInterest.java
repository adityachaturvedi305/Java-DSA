package basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double p = sc.nextDouble();
        System.out.print("Enter rate : ");
        double r = sc.nextDouble();
        System.out.print("Enter time : ");
        double t = sc.nextDouble();
        double simple_interest = (p * r * t) / 100.0;
        System.out.print("Simple interest is : ");
        System.out.println(simple_interest);


    }
}
