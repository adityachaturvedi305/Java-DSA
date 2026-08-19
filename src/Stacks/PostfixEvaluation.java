package Stacks;

import java.util.Stack;

public class PostfixEvaluation {
    static void main() {
        String s = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') val.push(ch-48);
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1 + v2);
                if(ch == '-') val.push(v1 - v2);
                if(ch == '*') val.push(v1 * v2);
                if(ch == '/') val.push(v1 / v2);
            }
        }
        System.out.println(val.peek());
    }
}
