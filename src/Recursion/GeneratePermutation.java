package Recursion;

public class GeneratePermutation {
    public static void main(String[] args) {
        String s = "abc";
        genPer(s,"");
    }

    private static void genPer(String s,String ans) {
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String remaining = left+right;
            genPer(remaining,ans+ch);
        }
    }
}
