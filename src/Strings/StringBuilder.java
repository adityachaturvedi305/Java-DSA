package Strings;

public class StringBuilder {
//    ArrayList<Character> str = new ArrayList<>();
//    str.add('a');
//    str.set(0,'r');
    public static void main(String[] args){
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Raghav");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);

        s.append("sdfdgfgfhghgdfgdfhfhgfdgfdfgdhhgfhgfhfghfgfg");
        System.out.println(s.length()+" "+s.capacity());
    }
}
