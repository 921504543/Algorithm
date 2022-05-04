package DTcourseDataStructure.p35.util;

public class ArrayBinaryTree {
    int[] data;
    public ArrayBinaryTree(int[] data){
        this.data=data;
    }
//    前序遍历 根左右
    public void frontShow(int index){
        if (data==null||data.length==0){
            return;
        }
        System.out.println(data[index]);
//        左为index*2+1
        if (index*2+1<data.length){
            frontShow(index*2+1);
        }
        if (index*2+2<data.length){
            frontShow(index*2+2);
        }
    }
    public void midShow(int index){
        if (data==null||data.length==0){
            return;
        }
        if (index*2+1<data.length){
            midShow(index*2+1);
        }
        System.out.println(data[index]);
        if (index*2+2<data.length){
            midShow(index*2+2);
        }
    }
    public void afterShow(int index){
        if (data==null||data.length==0){
            return;
        }
        if (index*2+1<data.length){
            afterShow(index*2+1);
        }
        if (index*2+2<data.length){
            afterShow(index*2+2);
        }
        System.out.println(data[index]);

    }
}
