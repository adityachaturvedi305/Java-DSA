package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Pikachu p = new Pikachu();
        Human h = new Human();

        d.speak();
        c.speak();
        p.speak();
        h.speak();
    }

}
