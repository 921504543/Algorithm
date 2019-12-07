package LeetCode;

import java.util.Stack;

public class reverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        Stack<Character> a =new Stack<>();
        for (int i=0;i<S.length();i++){
            a.push(S.charAt(i));
        }
        StringBuilder b=new StringBuilder();
        b.append(a.pop());
        String c=b.toString();
        return c;
    }
}
