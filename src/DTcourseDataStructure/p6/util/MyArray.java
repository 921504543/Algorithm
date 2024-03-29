package DTcourseDataStructure.p6.util;

import java.util.Arrays;

public class MyArray {
    //    用于存储数据的数组
    private int[] elements;
    public MyArray(){
    //        构造方法空数组
        elements=new int[0];
    }
    //    获取数组长度方法
    public int size(){
        return elements.length;
    }
    //    往数组的末尾添加元素
    public void append(int element){
        int[] newArr = new  int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
    //    打印所有元素到控制台
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
//    删除元素
    public void remove(int index){
//        判断是否越界
        if (index<0||index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        int[] newArr=new int[elements.length-1];
        for (int i = 0; i < newArr.length; i++) {
            if (i<index){
                newArr[i]=elements[i];
            }
            else {
                newArr[i]=elements[i+1];
            }
        }
        elements=newArr;
    }
//    获取某个下标元素
    public int get(int index){
        if (index>elements.length-1){
            return -1;
        }
        else {
            return elements[index];
        }
    }
//    插入一个元素到指定位置
    public void insert(int index,int element){
        int[] newArr=new int[elements.length+1];
        for (int i = 0; i < newArr.length; i++) {
            if (i<index){
                newArr[i]=elements[i];
            }
            else if(i==index){
                newArr[i]=element;
            }
            else{
                newArr[i]=elements[i-1];
            }
        }
        elements=newArr;
    }
//    替换
    public void replace(int index,int element){
        if (index<0||index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        elements[index]=element;
    }
//    查找
    public int search(int target){
//        目标元素
//        int target=6;
        int index=-1;
//        遍历数组
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]==target){
                index=i;
                break;
            }
        }
        return index;
    }
//    二分查找
    public int binarySearch(int target){
//        目标元素
//        int target=4;
        int index=-1;
//        开始定义中间开始结束
        int begin=0;
        int end=elements.length-1;
        int mid=(begin+end)/2;
        while (true){
            if (begin>=end){
                return -1;
            }
            if (elements[mid]==target){
                index=mid;
                break;
            }
            else {
                if (target>elements[mid]){
                    begin=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            mid=(begin+end)/2;
        }
        return index;
    }
}
