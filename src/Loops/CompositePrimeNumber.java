package Loops;

import java.util.Scanner;

public class CompositePrimeNumber { // composite --> more than 2 factors
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean flag = true; // true means prime
        for(int i = 2; i <= Math.sqrt(n); i++){ // if 'i' is a factor of 'n' then 'n/i' is also a factor of 'n'
            if(n%i == 0){ // 'i' to 'n/i' ka ek factor nikla :- (i = n/i --> i^2 = n)
                flag = false; // false means composite
                break;
            }
        }
        if(n==1) System.out.println("neither prime nor composite");
        else if(flag == false) System.out.println("Composite number");
        else System.out.println("Prime");
    }
}
