package OOPS;
class GroupStudents{
    int age;
    String name;
    GroupStudents(int age,String name){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println(this.age + " " + this.name);
    }
}
public class Practice {
    public static void main(String[] args) {
        GroupStudents s1 = new GroupStudents(18,"aman");
        GroupStudents s2 = new GroupStudents(19,"ankit");
        s1.display();
        s2.display();
    }
}
