package DTcourseDataStructure.p10.util;
//栈底层为数组，增删查改
public class Mystack {
    int[] elements;
    public Mystack(){
        elements=new int[0];
    }
//    增加push
    public void push(int element){
        int[] newArr= new int[elements.length+1];
        for (int i = 0; i < newArr.length-1; i++) {
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
//    删除并返回pop
    public void pop(){
        if (elements.length==0){
            System.out.println(-1);
        }
        else {
            int[] newArr=new int[elements.length-1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i]=elements[i];
            }
            int popNumber=elements[elements.length-1];
            elements=newArr;
            System.out.println(popNumber);
        }
    }
//    查看栈顶元素
    public void peek(){
        if (elements.length==0){
            System.out.println(-1);
        }
        else {
            int popNumber=elements[elements.length-1];
            System.out.println(popNumber);
        }
    }
//    判断栈是否为空
    public boolean isEmpty(){
        if (elements.length==0){
            return true;
        }
        else {
            return false;
        }
    }
}
