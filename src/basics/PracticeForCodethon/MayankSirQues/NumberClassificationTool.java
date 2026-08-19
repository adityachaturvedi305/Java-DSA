package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class NumberClassificationTool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%7==0) System.out.println("Number is divisible by 5 and 7 both");
        else System.out.println("Number is not divisible by 5 and 7");
        if(n>0) System.out.println("Number is positive");
        else if(n<0) System.out.println("Number is negative");
        else System.out.println("Number is zero");
        if(n%2==0) System.out.println("Number is even");
        else System.out.println("Number is odd");
        sc.close();
    }
}
