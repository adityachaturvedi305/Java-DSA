package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40);
        int ele = 50;
        System.out.println(st);
        pushAtBot(st,ele);
        System.out.println(st);
    }

    public static void pushAtBot(Stack<Integer> st, int ele) {
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBot(st,ele);
        st.push(top);
    }
}
