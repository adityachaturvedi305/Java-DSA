package OOPS;
class  Students{
    String name; // null
    private int rollNo; // 0
    double cgpa; // 0.0
    public void print(){ // getter
        System.out.println(name+" "+rollNo+" "+cgpa);
    }
    int getRollNo(){ // getter
        return rollNo;
    }
    void setRollNo(int x){ // setter
        rollNo = x;
    }
//    void p(){
//        print();
//    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
//        System.out.println(s1.rollNo);
        s1.print();
        s1.cgpa = 8.9;
        s1.name = "Raghav";
//        s1.rollNo = 76;
        s1.setRollNo(45);
        s1.print();
        System.out.println(s1.getRollNo());

    }

}
