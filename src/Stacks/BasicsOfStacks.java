package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
//        System.out.println(st.peek()); // it will give empty stack exception
//        st.pop(); // it will also give empty stack exception
        st.push("Khushi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st +" "+ st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it return top most element and then remove
        String s = st.pop();
    }
}
