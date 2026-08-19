package OOPS;

public class RevisionOOPS {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Electric",70);
        p1.type = "Fire";
//        p1.power = 34; // ERROR
        Pokemon p2 = new Pokemon("Fairy",50);
//        System.out.println(p1,power);
        System.out.println(p1.getPower());
        p1.print(); p2.print();
    }

}
