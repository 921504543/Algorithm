package DTcourseDataStructure.p16.util;

public class DoubleNode {
    DoubleNode pre=this;
    DoubleNode next=this;
    int data;
    public DoubleNode(int data){
        this.data=data;
    }
//    插入新的节点的时候，应该从后面开始做起，否则要加新中间变量，防止被覆盖
    public void insert(DoubleNode node){
        DoubleNode thisNextNode=this.next;
//        当前的下一个节点定为node
        this.next=node;
//        node的前一个节点定为this
        node.pre=this;
//        node的下一个节点定为原节点的下个节点
        node.next=thisNextNode;
//        原来的下一个节点的上一个节点为node
        thisNextNode.pre=node;
//        一共是四步
    }
//   先改的后面
    public void insert2(DoubleNode node){
        node.next=this.next;
        this.next.pre=node;
        this.next=node;
        node.pre=this;
    }
    public DoubleNode next(){
        return this.next;
    }
    public DoubleNode pre(){
        return this.pre;
    }
    public int getData(){
        return this.data;
    }
}
