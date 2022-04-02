package DTcourseDataStructure.p15;

import DTcourseDataStructure.p15.util.LoopNode;

public class MyLoopNode {
    public static void main(String[] args) {
        LoopNode loopNode1=new LoopNode(1);
        LoopNode loopNode2=new LoopNode(2);
        LoopNode loopNode3=new LoopNode(3);
        loopNode1.insert(loopNode2);
        loopNode2.insert(loopNode3);
        System.out.println(loopNode1.next().getData());
        System.out.println(loopNode1.next().next().getData());
        System.out.println(loopNode1.next().next().next().getData());
        System.out.println(loopNode1.next().next().next().next().getData());
        System.out.println(loopNode1.next().next().next().next().next().getData());
    }
}
