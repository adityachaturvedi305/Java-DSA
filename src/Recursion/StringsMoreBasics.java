package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringsMoreBasics {
    public static void main(String[] args) {
        String s = "Kartik";
        change(s);
        System.out.println(s);

        String[] arr = {"Anmol","Dhruv", "hemant","Ashu"};
//        ArrayList<String> list = new ArrayList<>();
        List<String>list = new ArrayList<>();
        list.add("Abhi");
        list.add("Aryan");
        list.add("Riya");
        System.out.println(list);
        change2(list);
        System.out.println(list);
    }

    private static void change2(List<String> list) {
        list.add("Biplab");
    }

    public static void change(String s) {
        s = "Lavish";
    }
}
