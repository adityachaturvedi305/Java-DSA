package OOPS;
import java.util.Scanner;
class Person{
    String name;
}
class StudentN extends Person{
    int marks;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class PersonClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int marks = sc.nextInt();
        StudentN s = new StudentN();
        s.name = name;
        s.marks = marks;
        s.display();
    }
}
