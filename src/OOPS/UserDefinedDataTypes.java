package OOPS;

import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    double Cgpa;
    void print(){
        System.out.println(name+" "+rollNo+" "+Cgpa);
    }
}
public class UserDefinedDataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentN s1 = new StudentN();
        s1.name = "Rahul";
//        s1.rollNo = sc.nextInt();
//        s1.Cgpa = 6.9;

        StudentN s2 = new StudentN();
        s2.name = "Sam";
//        s2.rollNo = 3;
//        s2.Cgpa = 6.99;

        StudentN s3 = new StudentN();
        s3.name = "Ravi";
//        s3.rollNo = 69;
//        s3.Cgpa = 6.90;
//        System.out.println(s1.name+" "+s1.rollNo+" "+s1.Cgpa);
//        System.out.println(s2.name+" "+s2.rollNo+" "+s2.Cgpa);
//        System.out.println(s3.name+" "+s3.rollNo+" "+s3.Cgpa);

//        s1.print();
//        s2.print();
//        s3.print();
    }

}
