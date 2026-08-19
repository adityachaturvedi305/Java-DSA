package basics.PracticeForCodethon;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int fact = 0;
        if(n<=0){
            System.out.println("Invalid input!");
            return;
        }
        for(int i=1; i<n; i++){
            if(n%i==0) fact += i;
        }
        if(n==fact) System.out.println("Perfect number");
        else System.out.println("Not an Perfect number");
    }

}
