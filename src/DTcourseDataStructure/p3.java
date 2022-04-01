package DTcourseDataStructure;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
//        System.out.println("hello world");
        int[] a=new int[10];
//        往里面填充的是0初始值，a其实是个对象 for遍历数组，a.length是个属性
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//        创建过程中同时为数组中的元素赋值
        int[] arr2 = new  int[]{90,80,70,60,50};
        System.out.println(arr2.length);
//        快速打印arr2的元素
        System.out.println(Arrays.toString(arr2));
//        给数组新加元素
//        新建数组，将原数组的元素放到新数组，然后再加入新元素
        int newInt=3;
        int[] arr3=new int[arr2.length+1];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i]=arr2[i];
        }
        arr3[arr2.length]=newInt;
        arr2=arr3;
        System.out.println(Arrays.toString(arr2));
//        删除元素
        int[] arr4=new int[]{9,8,7,6,5,4};
//        要删除元素的下标
        int dst = 3;
//        创建新数组，长度是原数组减一
        int[] newArr=new int[arr4.length-1];
//        复制除了要删除的元素的其他元素
        for (int i = 0; i < newArr.length; i++) {
//            要删除的之前的
            if (i<dst){
                newArr[i]=arr4[i];
            }
//            要删除的之后的
            else {
                newArr[i]=arr4[i+1];
            }
        }

//        新替换旧
        arr4=newArr;
        System.out.println(Arrays.toString(arr4));

    }
}
