package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacterMethod2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String s = sc.nextLine();
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0, j=0;
        while(j<n){
            if (arr[i]==arr[j]) j++;
            else {
                int freq = j-i;
                if(freq>maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq>maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        System.out.println(ans);
    }
}
