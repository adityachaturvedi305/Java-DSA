package OOPS;

import java.util.Arrays;

public class Marks {
    public static class StudentsData{
        String name;
        int rollNo;
        int[] marks;
        StudentsData(int[] a){
            marks = Arrays.copyOf(a,a.length);
        }
        StudentsData(int a){
            marks = new int[a];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,5};
        StudentsData s1 = new StudentsData(arr);
        s1.marks[0] = 48;
        System.out.println(arr[0]);

        StudentsData s2 = new StudentsData(2);
//        s1.marks[0] = 69;
//        s1.marks[1] = 99;
//        s1.marks[2] = 89;
//        s1.marks[4] = 79;
    }

}
