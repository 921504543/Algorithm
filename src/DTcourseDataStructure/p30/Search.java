package DTcourseDataStructure.p30;

import DTcourseDataStructure.p30.util.BinaryTree;
import DTcourseDataStructure.p30.util.TreeNode;

public class Search {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        TreeNode root=new TreeNode(1);
        binaryTree.setRoot(root);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
        root.setlNode(node1);
        root.setrNode(node2);
        node1.setlNode(new TreeNode(4));
        node1.setrNode(new TreeNode(5));
        node2.setlNode(new TreeNode(6));
        node2.setrNode(new TreeNode(7));
        System.out.println(binaryTree.frontSearch(8));

    }
}
