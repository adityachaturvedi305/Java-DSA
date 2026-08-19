package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class TraversalTheStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < 5; i++) st.push(sc.nextInt());
        Stack<Integer> temp =  new Stack<>();
        while (!st.isEmpty()){
            int top = st.pop();
            System.out.println(top);
            temp.push(top);
        }
        System.out.println(temp);
    }
}
