package OOPS;
class Cricketer{
//    final String country = "India";
    static String country = "NZ";
    int runs;
    String name;
    double avg;
    static void greet(){
        System.out.println("Hello");
    }
}
public class FinalAndStaticKeyword {
    public static void main(String[] args) {
        Cricketer.greet();
        System.out.println(Cricketer.country);
//        final int x = 3; // x can't be change
//        x = 7;
//        Cricketer c1 = new Cricketer();
//        c1.country = "England"; // ERROR
//        Cricketer c2 = new Cricketer();
//        c1.country = "India";
//        System.out.println(c2.country);
//        c2.greet();
    }
}