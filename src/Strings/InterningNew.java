package Strings;

public class InterningNew {
    public static boolean equals(String s1, String s2){
        if(s1.length()!= s2.length()) return false;
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i)!= s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
//        String s1 = "raghav";
//        String s2 = new String("raghav");
//        s = "madhav";
//        System.out.println(s1==s2);
//        System.out.println(s1.charAt(0)==s2.charAt(0));
//        String t = "raghav";
//        String u = "raghav";
//        System.out.println(t==u);
        String s1 = new String("raghav");
        String s2 = new String("raghav");
        System.out.println(s1.equals(s2));
    }
}
