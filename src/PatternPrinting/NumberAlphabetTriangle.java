package PatternPrinting;

import java.util.Scanner;

public class NumberAlphabetTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= i; j++){ //determine print
                if(i%2==0) System.out.print((char)(j+64)+" ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
