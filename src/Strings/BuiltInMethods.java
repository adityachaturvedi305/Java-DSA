package Strings;

public class BuiltInMethods {
    public static void main(String[] args){
        String s = "harshita";
        System.out.println(s.indexOf('r'));
        System.out.println(s.lastIndexOf('r'));
        System.out.println(s.lastIndexOf('y'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase()); // s.toUpperCase(); --> it will not work for this we have to do [s = s.toUpperCase();
        System.out.println(s.contains("harsha"));
        if(s.contains("arsh")) System.out.println("happy");
        System.out.println(s.startsWith("harsh"));
        System.out.println(s.endsWith("ta"));
        String str = "74564545";
        int n = Integer.parseInt(str);
        System.out.println(n+1);

    }
}
