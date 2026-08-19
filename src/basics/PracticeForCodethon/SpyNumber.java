package basics.PracticeForCodethon;
import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            sum += ld;
            product *= ld;
            n /= 10;
        }
        if(sum == product) System.out.println("Spy number");
        else System.out.println("Not an Spy number");
    }
}
