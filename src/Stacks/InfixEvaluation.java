package Stacks;
import java.util.Stack;
public class InfixEvaluation {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i = 0;
        while (i < s.length()){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') val.push(ch - 48);
            else if(op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
            else if(ch == ')'){
                while (op.peek() != '('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                }
                op.pop(); // '(' remove
            }
            else {
                if(ch == '+' || ch == '-') {// work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();// push
                    op.push(ch);
                }
                if(ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {// work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.pop();// push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
            i++;
        }
        while(!op.isEmpty()){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '+') val.push(v1 + v2);
            if(op.peek() == '-') val.push(v1 - v2);
            if(op.peek() == '*') val.push(v1 * v2);
            if(op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
