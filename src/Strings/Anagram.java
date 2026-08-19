package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        // latent --> talent
        // anagram --> nagaram
        // listen --> silent
        // fired --> fried
        // race --> care
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st sentence : ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd sentence : ");
        String s2 = sc.nextLine();
        boolean Anagram = true;
        if(s1.length()!=s2.length()) Anagram = false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]) {
                Anagram = false;
                break;
            }
        }
        if(Anagram) System.out.print("Yes");
        else System.out.println("No");
    }
}
