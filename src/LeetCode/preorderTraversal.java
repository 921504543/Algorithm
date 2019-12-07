//package LeetCode;
//
//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.List;
//
//public class preorderTraversal {
//    List<Integer> a;
//    public List<Integer> preorderTraversal(TreeNode root) {
//        a=new LinkedList<>();
//        if(root==null);
//        preorder(a,root);
//        return a;
//    }
//    public void preorder(List a,TreeNode root){
//        if (root==null){
//            return;
//        }
//        a.add(root.val);
//        preorder(a,root.left);
//        preorder(a,root.right);
//    }
//}