package PatternPrinting;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= i; j++){ //determine print
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
