package Strings;

public class CompareToStringMethods {
    public static void main(String[] args){
        String a = "harmeet"; // m n o p q r s
        String b = "harsh";
        System.out.println(a.compareTo(b));
        String c = "harshitam";
        String d = "harsh";
        System.out.println(c.compareTo(d)); // If same then count remaining words of another string
//        System.out.println(a.concat(b));
        a = a + b;
        System.out.println(a);
    }
}
