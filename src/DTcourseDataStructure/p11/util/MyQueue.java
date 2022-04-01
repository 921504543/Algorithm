package DTcourseDataStructure.p11.util;

public class MyQueue {
    int[] elements;
    public MyQueue(){
        elements=new int[0];
    }
    public void add(int element){
        int[] newArr= new int[elements.length+1];
        for (int i = 0; i < newArr.length-1; i++) {
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
    public int pull(){
        int[] newArr= new int[elements.length-1];
        int pullNumber=elements[0];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=elements[i+1];
        }
        elements=newArr;
        return pullNumber;
    }
    public boolean isEmpty(){
        return elements.length==0;
    }
}
