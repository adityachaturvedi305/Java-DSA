package PatternPrinting;

import java.util.Scanner;

public class SpecialAlphabetSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 65, b = 97;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                if(i%2!=0) System.out.print((char)b+" ");
                else System.out.print((char)a+" ");
            }
            a++;
            b++;
            System.out.println();
        }
    }
}
