package basics.PracticeForCodethon;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which term you need: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=1; i<n; i++){
            int next = a+b;
            a=b;
            b=next;
        }
        System.out.println(n+" th term of Fibonacci series: "+a);
    }

}
