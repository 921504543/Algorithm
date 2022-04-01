package LeetCode;

//import javafx.scene.Node;

import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class levelOrder {
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> lists=new LinkedList<>();
//        List<Integer> list=new LinkedList<>();
//        Queue<Node> a=new LinkedList<>();
//        if (root==null) return lists;
//        a.add(root);
//        int len=a.size(),index=0;
//        while (index<len){
//            list.add(a.peek().val);
//             a.addAll(a.poll().children);
//             if (index==len){
//                 lists.add(list);
//                 list=new LinkedList<>();
//                 len=a.size();
//                 index=0;
//             }
//             index++;
//        }
//        return lists;
//    }
//}
