package PatternPrinting;

import java.util.Scanner;

public class Alphabet1Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){ // detemine lines
//            int a = 65;
            for(int j = 1; j <= n; j++){ //determine print
//                System.out.print((char)a+" ");
//                a++;
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
