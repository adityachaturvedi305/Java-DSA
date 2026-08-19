package Strings;

import java.util.Scanner;

public class MostFrequentCharacterMethod1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String s = sc.nextLine();
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        for(int i=0; i<n; i++){
            int freq = 1;
            char ch = s.charAt(i);
            for(int j=i+1; j<n; j++){
                if(s.charAt(j)==ch) freq++;
            }
            if(freq>maxFreq){
                maxFreq = freq;
                ans = ch;
            }
            else if(freq==maxFreq && ch<ans) ans = ch;
        }
        System.out.println(ans);
    }
}
