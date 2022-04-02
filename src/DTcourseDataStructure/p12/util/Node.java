package DTcourseDataStructure.p12.util;

public class Node {
    int data;
    Node next;
    public Node(int data){

        this.data=data;
    }
//    无限增加元素
    public Node append(Node node){
        Node currentNode=this;
        while (true){
            if (currentNode.next()!=null){
                currentNode=currentNode.next();
            }else {
                currentNode.next=node;

                break;
            }
        }
        return currentNode.next;
    }
    public void removeNext(){
        this.next=this.next.next;
    }
    public void insert(Node newNode){
        Node beifen=this.next;
        this.next=newNode;
        newNode.next=beifen;
    }
    public Node next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    public boolean isLast(){
        return next==null;
    }
    public void show(){
        Node currentNode=this;
        while (true){
            if (currentNode.next!=null){
                System.out.print(currentNode.data+"->");
                currentNode=currentNode.next;
            }
            else {
                System.out.print(currentNode.data);
                break;
            }
        }

    }
}
