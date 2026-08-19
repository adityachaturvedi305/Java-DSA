package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    static void main() {
        String s = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i = s.length()-1 ; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') val.push(ch+"");
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                if(ch == '+') val.push('(' + v1 + '+' + v2 + ')');
                if(ch == '-') val.push('(' + v1 + '-' + v2 + ')');
                if(ch == '*') val.push('(' + v1 + '*' + v2 + ')');
                if(ch == '/') val.push('(' + v1 + '/' + v2 + ')');
            }
        }
        System.out.println(val.peek());
    }
}
