package PatternPrinting;

import java.util.Scanner;

public class Alphabet2Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a = 65;
        for(int i = 1; i <= n; i++){ // detemine lines
            for(int j = 1; j <= i; j++){ //determine print
                System.out.print((char)(i+64)+" ");
//                System.out.print((char)a+" ");
            }

//            a++;
            System.out.println();
        }
    }
}
