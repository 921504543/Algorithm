package LeetCode;

import java.util.Stack;

public class calPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> a=new Stack<>();
        for (int i=0;i<ops.length;i++){
            itcase:switch (ops[i]){
                case "+":{
                    int temp=a.pop();
                    int nowtemp=temp+a.peek();
                    a.push(temp);
                    a.push(nowtemp);
                    break itcase;
                }
                case "D":{
                    a.push(a.peek()*2);
                    break itcase;
                }
                case "C":{
                    a.pop();
                    break itcase;
                }
                default:{a.push(Integer.parseInt(ops[i]));
                break itcase;
                }
            }

        }
        int result=0;
        for (int o:a){
            result+=o;
        }
        return result;
    }
}
