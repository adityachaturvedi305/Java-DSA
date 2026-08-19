package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') val.push(ch+"");
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                if(ch == '+') val.push('(' + v1 + '+' + v2 + ')');
                if(ch == '-') val.push('(' + v1 + '-' + v2 + ')');
                if(ch == '*') val.push('(' + v1 + '*' + v2 + ')');
                if(ch == '/') val.push('(' + v1 + '/' + v2 + ')');
            }
        }
        System.out.println(val.peek());
    }
}
