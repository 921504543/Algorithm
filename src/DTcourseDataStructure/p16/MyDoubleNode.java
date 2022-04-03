package DTcourseDataStructure.p16;

import DTcourseDataStructure.p16.util.DoubleNode;

public class MyDoubleNode {
    public static void main(String[] args) {
        DoubleNode node1=new DoubleNode(1);
        DoubleNode node2=new DoubleNode(2);
        DoubleNode node3=new DoubleNode(3);
        node1.insert(node2);
        node2.insert(node3);
        System.out.println(node1.next().next().pre().getData());


    }
}
