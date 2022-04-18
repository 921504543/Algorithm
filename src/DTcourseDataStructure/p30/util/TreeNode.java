package DTcourseDataStructure.p30.util;

public class TreeNode {
    int value;
    TreeNode lNode;
    TreeNode rNode;
    public TreeNode(int value){
        this.value=value;
    }
//    第一步肯定要先设置左右节点

    public void setlNode(TreeNode lNode) {
        this.lNode = lNode;
    }

    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }
//    归根到底是节点的遍历
    public void frontShow(){
        System.out.print(value);
        if(lNode!=null){
            lNode.frontShow();
        }
        if(rNode!=null){
            rNode.frontShow();
        }
    }
    public void midShow(){
        if(this.lNode!=null){
            this.lNode.midShow();
        }
        System.out.println(this.value);
        if (this.rNode!=null){
            this.rNode.midShow();
        }
    }
    public void afterShow(){
        if (this.lNode!=null){
            this.lNode.afterShow();
        }
        if (this.rNode!=null){
            this.rNode.afterShow();
        }
        System.out.println(this.value);
    }
    public TreeNode frontSearch(int i){
        TreeNode target=null;
        if (this.value==i){
            return this;
        }else{
            if (this.lNode!=null){
                target=this.lNode.frontSearch(i);
            }
            if (target!=null){
                return target;
            }
            if (this.rNode!=null) {
                target = this.rNode.frontSearch(i);
            }
        }
        return target;
    }
}
