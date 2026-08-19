package OOPS;
class Ani{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Do extends Ani{
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog bark");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        Ani a = new Do();
        a.sound();
    }
}
