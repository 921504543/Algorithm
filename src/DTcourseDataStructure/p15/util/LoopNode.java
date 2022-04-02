package DTcourseDataStructure.p15.util;

public class LoopNode {
    int data;
    LoopNode next=this;
    public LoopNode(int data){
        this.data=data;
    }
    
    public void removeNext(){
        this.next=this.next.next;
    }
    public void insert(LoopNode newNode){
//        指向自己
        LoopNode beifen=this.next;
//        然后指向新的节点
        this.next=newNode;
//        新节点再指向最开始的节点
        newNode.next=beifen;
    }
    public LoopNode next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }


}
