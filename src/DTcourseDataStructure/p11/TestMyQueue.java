package DTcourseDataStructure.p11;

import DTcourseDataStructure.p11.util.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        System.out.println(myQueue.isEmpty());
    }
}
