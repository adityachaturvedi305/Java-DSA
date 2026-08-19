package basics.PracticeForCodethon;
import java.util.Scanner;
public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = 1;
        while(count < n){
            num++;
            if(isPrime(num)) count++;
        }
        System.out.println(num);
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
