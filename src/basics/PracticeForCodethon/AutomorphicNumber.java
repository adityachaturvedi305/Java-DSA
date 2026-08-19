package basics.PracticeForCodethon;
import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int orig = n;
        int square = n*n;
        int digits = 0;
        if(n==0) digits = 1;
        while (n!=0){
            digits++;
            n /= 10;
        }
        int helper = (int)Math.pow(10,digits);
        if(square%helper == orig) System.out.println("Automorphic number");
        else System.out.println("Not an Automorphic number");
    }
}
