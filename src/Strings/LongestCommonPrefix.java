package Strings;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("");
            return;
        }
        String[] a = new String[n];
        for(int i=0; i<n; i++) a[i] = sc.next();
        String p = a[0];
        for(int i=1; i<n; i++){
            while(a[i].indexOf(p) != 0){
                p = p.substring(0, p.length()-1);
                if(p.isEmpty()){
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(p);
    }
}
