package Recursion;

public class PrintKCharacterSubsets {
    public static void main(String[] args) {
        String s = "abc";
        subsets("", s, 0, 3);
    }
    static void subsets(String ans, String s, int idx,int k){
        if(ans.length() == k){
            System.out.print(ans+" ");
            return;
        }
        if(s.length() == idx){
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1, k);
        subsets(ans,s,idx+1, k);
    }
}
