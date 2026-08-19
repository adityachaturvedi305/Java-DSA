package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSorting {
    public static void main(String[] args) {
        Integer[] arr = {3,1,5,2,7,4,9};
        Arrays.sort(arr, (a,b) -> b-a);
//        Arrays.sort(arr, (a,b) -> Math.abs(b)-Math.abs(a));
//        Arrays.sort(arr, Comparator.comparingInt(Math::abs));
        print(arr);
    }

    public static void print(Integer[] arr){
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }

}
