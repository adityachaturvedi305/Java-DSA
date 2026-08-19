package basics.PracticeForCodethon;

import java.util.Scanner;

public class StrongOrKrishnaMurtiNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int orig = n;
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            int fact = 1;
            for(int i = 1; i<=ld; i++){
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if(sum == orig) System.out.println("Strong number");
        else System.out.println("Not an Strong number");
    }

}
