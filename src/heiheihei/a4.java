package heiheihei;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        int a;//声明变量a
        Scanner reader =new Scanner(System.in);//这一步是创建对象 创建对象在a5吧，scanner类的reader对象，new是把他实体化的意思；这句话先记住
        a=reader.nextInt();//给a赋值，这里怎么赋值的呢，调用reader对象的方法，.nextInt()这个东西就是方法，可以去看a1里面有个sum()和那玩意一样，输入int型就是nextInt，输入Byte型就是nextByte
        System.out.println(a);//输出
    }
}

//实践一个题，自己声明一个长方形的长和宽，输入正方形的长和宽，然后输出面积
