package DTcourseDataStructure.p30.util;

public class BinaryTree {
    //第一步肯定是设置根节点
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }
//    前序遍历，此时这个类只是树的一个框架，树的里面的节点的遍历才是真的遍历
    public void frontShow(){
        root.frontShow();
    }
//    中序遍历，左中右顺序
    public void midShow(){
        root.midShow();
    }
//    后序遍历，左右中
    public void afterShow(){
        root.afterShow();
    }
    public TreeNode frontSearch(int i){
        return root.frontSearch(i);
    }
}
