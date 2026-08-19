package Methods;

public class ReturnType {
    public static int prasun(int a){
        System.out.println("Banu");
        System.out.println("Nanda");
        if (a>0) return 5; // Khatam
        else return 10;
    }
    public static void main(String[] args){
        int x = prasun(7);
        System.out.println(3+x);
//        prasun(); // stand alone call lagai bas
    }
}
