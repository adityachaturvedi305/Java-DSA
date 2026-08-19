package basics.PracticeForCodethon;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a == 0 || b == 0){
            System.out.println("LCM is 0");
            sc.close();
            return;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int hcf = 1;
        for(int i = Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i == 0){
                hcf = i;
                break;
            }
        }
        int lcm = (a / hcf)*b;
        System.out.println("LCM is "+ lcm);
        sc.close();
    }

}
