package Arrays1D;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Vector<Integer> ans = new Vector<>();
        int carry = 1;
        for(int i = size-1; i>=0;i--){
            if(arr[i]+carry <= 9){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else {
                ans.add(0);
                carry = 1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
