package DTcourseDataStructure.p12;

import DTcourseDataStructure.p12.util.Node;

public class MyNode {
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        node1.append(node2);
        node2.append(node3);
        System.out.println(node1.next().getData());
        System.out.println(node1.next().next().getData());
    }
}
