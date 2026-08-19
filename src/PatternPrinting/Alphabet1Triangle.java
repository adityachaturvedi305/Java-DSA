package PatternPrinting;

import java.util.Scanner;

public class Alphabet1Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
//            int a = 65;
            for(int j = 1; j <= i; j++){ //determine print
                System.out.print((char)(j+64)+" ");
//                System.out.print((char)a+" ");
//                a++;
            }
            System.out.println();
        }
    }
}
