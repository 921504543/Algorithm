package heiheihei;

public class a2 {
    public static void main(String[] args) {//主方法
        int []a={0,1,2,3,4,5,6,7,8,9};//声明数组：数据类型 []变量={}；或者 数据类型 []a=new 数据类型： int []a=new int[];另外数组是从0开始计数，即a[0]=0,a[1]=1;
        int sum=0;//声明整型变量sum
        for (int i=0;i<a.length;i++){//int i从零开始，到a数组的长度-1；每一次加一
            sum+=a[i];//sum=sum+a[i];
        }
        System.out.println("the sum is"+sum);//有点像字符串拼接的意思
        int y=sum>0?sum:-sum;//三目运算符sum>0吗？大于0的话y是sum，小于0的话是-sum
        System.out.println(y);//输出y的值
    }
}
//尝试去写一个数组，将一个数组的奇数项和偶数项相减的结果输出出来,自己写数组里的东西。