package PatternPrinting;

import java.util.Scanner;

public class NumberSpiralFinal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 2*n-1; i++){
            for(int j = 1; j <= 2*n-1; j++){
                int a = i, b = j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }

//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++) cout<<min(i, j) << " ";
//            for(int j = n-1; j >= 1; j--) cout<<min(i, j) << " ";
//            cout<<endl;
//        }
//
//        for(int i = n-1; i >= 1; i--){
//            for(int j = 1; j <= n; j++) cout<<min(i, j) << " ";
//            for(int j = n-1; j >= 1; j--) cout<<min(i, j) << " ";
//            cout<<endl;
//        }
    }
}
