package heiheihei;

public class a3 {
    public static void main(String[] args) {//主方法
        int a=0;//赋值
        int b=1;
        if (a==b){//如果a=b
            System.out.println("两数相等");
        }
        else if (a>b){//这里和c语言长得不一样 注意 是else if
            System.out.println("不相等且a大于b");
        }
        else
            System.out.println("不相等且a小于b");

        switch (a){//switch语句 当情况有很多很多的时候用
            case 1://当a的值是1的时候，switch的参数不能是布尔型，不懂布尔型去搜
                System.out.println("lalala");//输出
                break;//跳出
            default://以上都不满足
                System.out.println("imposible");//输出
        }
    }
}
//练习写 学生等级判断 优良中及格不及格
//练习写 判断月份天数

//加强题：
//给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：//给定一系列数用a4里的，不急慢慢看
//
//A1 = 能被5整除的数字中所有偶数的和；
//A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
//A3 = 被5除后余2的数字的个数；
//A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
//A5 = 被5除后余4的数字中最大数字。

//a4会讲如何输入 就是c语言里面的scanf