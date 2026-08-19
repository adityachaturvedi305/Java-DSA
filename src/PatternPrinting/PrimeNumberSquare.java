package PatternPrinting;
import java.util.Scanner;
public class PrimeNumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int a = 2;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               while(!isPrime(a)){
                   a++;
               }
               System.out.print(a+" ");
               a++;
            }
            System.out.println();
        }
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
