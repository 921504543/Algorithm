package DTcourseDataStructure.p12.util;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
    public void append(Node node){
        this.next=node;
    }
    public Node next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
}
