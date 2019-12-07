package LeetCode;

import java.util.Stack;

public class MinStack {
    public Stack<Integer> a;
    /** initialize your data structure here. */
    public MinStack() {
         a=new Stack<>();
    }

    public void push(int x) {
        if(a.isEmpty()){
            a.push(x);
            a.push(x);
        }
        else {
            int min=a.peek();
            if (x>min){
                a.push(x);
                a.push(min);
            }
            else {
                a.push(x);
                a.push(x);
            }
        }
    }

    public void pop() {
        a.pop();
        a.pop();
    }

    public int top() {
        return a.get(a.size()-2);
    }

    public int getMin() {
        return a.peek();
    }
}
