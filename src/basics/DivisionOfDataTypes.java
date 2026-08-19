package basics;

public class DivisionOfDataTypes {
    public static void main(String[] args){
        double x = 5/2; // int / int --> int
        System.out.println(x);
        double y = 5.0/2.0; // double / double --> double
        System.out.println(y);
        double z = 5/2.0; // int / double --> double
        System.out.println(z);
        double a = 5.0/2; // double / int --> double
        System.out.println(a);
    }
}
