package Methods;

public class MethodOverloading {
    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static int max(int a,int b,int c){
        return Math.max(a,Math.max(c,b));
    }
    public static void main(String[] args) {
        System.out.println(max(2,3));
        System.out.println(max(3,4,5));
    }

}
