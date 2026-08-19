package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.next();
        List<String> list = new ArrayList<>();
        subsets("",s,0,list);
        Collections.sort(list);
        System.out.println(list);
    }
    private static void subsets(String ans, String s, int idx,List<String> list) {
        if(idx == s.length()){
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1,list);
        subsets(ans,s,idx+1,list);
    }
}
