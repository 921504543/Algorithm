package DTcourseDataStructure.p35;

import DTcourseDataStructure.p35.util.ArrayBinaryTree;

public class MyArrayBinaryTree {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        ArrayBinaryTree tree=new ArrayBinaryTree(arr);
        tree.frontShow(0);
    }
}
