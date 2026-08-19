package basics.PracticeForCodethon;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int hcf = 1;
        for(int i=Math.min(a,b); i>=1 ; i--){
            if(a%i == 0 && b%i == 0){
                hcf = i;
                break;
            }
        }
        int lcm = (a*b)/hcf;
        System.out.println("HCF is "+hcf+" and LCM is "+lcm);
    }

}
