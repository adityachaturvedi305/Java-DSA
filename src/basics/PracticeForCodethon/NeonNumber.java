package basics.PracticeForCodethon;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int square = n*n;
        int digitsSum = 0;
        while(square!=0){
            digitsSum += square%10;
            square /= 10;
        }
        if(digitsSum == n) System.out.println("Neon number");
        else System.out.println("Not an neon number");
    }

}
