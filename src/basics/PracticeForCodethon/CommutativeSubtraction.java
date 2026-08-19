package basics.PracticeForCodethon;

import java.util.Scanner;

public class CommutativeSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int result = 0;
        int sign = 1;
        while(n!=0){
            int ld = n%10;
            result = result + (sign*ld);
            sign = - sign;
            n /= 10;
        }
        System.out.print("The result: "+result);
    }

}
