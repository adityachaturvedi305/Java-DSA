package basics.PracticeForCodethon;
import java.util.Scanner;
public class NumberOfPrimeSpecificRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
