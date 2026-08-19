package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i = 0;
        while (i < infix.length()){
            char ch = infix.charAt(i);
            if(ch >= '0' && ch <= '9') val.push(ch+"");
            else if(op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch == ')'){
                while (op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                }
                op.pop(); // '(' remove
            }
            else {
                if(ch == '+' || ch == '-') {// work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                    op.push(ch);
                }
                if(ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {// work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
            i++;
        }
        while(!op.isEmpty()){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = v1 + v2 + o;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
