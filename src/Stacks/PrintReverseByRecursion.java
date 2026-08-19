package Stacks;

import java.util.Stack;

public class PrintReverseByRecursion {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40);
        System.out.println(st);
        rev(st);
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
    public static void rev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        rev(st);
        pushAtBot(st,top);
    }
}
