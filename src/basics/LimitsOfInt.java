package basics;

public class LimitsOfInt {
    public static void main(String[] args){
        // Int-limit --> -2^31 to 2^31 - 1
        int x = Integer.MIN_VALUE;
        System.out.println(x);
        x = Integer.MAX_VALUE;
        System.out.println(x);
        // Long-limit --> -2^63 to 2^63 - 1
        long y = Long.MIN_VALUE;
        System.out.println(y);
        y = Long.MAX_VALUE;
        System.out.println(y);
    }
}
