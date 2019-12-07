package LeetCode;

import java.util.Stack;

public class isValid {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char []s1=s.toCharArray();
        if (s.isEmpty()) return true;
        if (s1[0]=='}'||s1[0]==']'||s1[0]==')') return false;
        for (int i=0;i<s1.length;i++){
            if (s1[i]=='{'||s1[i]=='['||s1[i]=='('){
                stack.push(s1[i]);
            }
            else if (s1[i]=='}'){
                if (stack.isEmpty()) return false;
               else if(stack.peek()!='{') return false;

                else stack.pop();
            }
            else if (s1[i]==']'){
                if (stack.isEmpty()) return false;
                else if(stack.peek()!='[') return false;

                else stack.pop();
            }
            else if (s1[i]==')'){
                if (stack.isEmpty()) return false;
               else if(stack.peek()!='(') return false;

                else stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
