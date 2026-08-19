package IfElse;

import java.util.Scanner;

public class BonusOnSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();
        double final_salary;
        if(salary<20000) final_salary = salary+salary*0.1;
        else if(salary>=20000 && salary<=40000) final_salary = salary+salary*0.07;
        else final_salary = salary+salary*0.05;
        System.out.println(final_salary);
    }
}
