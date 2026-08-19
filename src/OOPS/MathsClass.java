package OOPS;

import java.util.Scanner;

class Maths{
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }
}
public class MathsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Maths m = new Maths();
        System.out.println("Sum of 2 numbers: " + m.add(a, b));
        System.out.println("Sum of 3 numbers: " + m.add(a, b, c));
    }
}
