package heiheihei;
//字符串类
public class a8 {
    public static void main(String[] args) {
        String a=new String("lalalalademaxiya");//声明字符串的几种方法
        String s="Hello"+"Java";
        String s1=s+" "+"good";
        System.out.println(a);
        System.out.println(s1.length());//返回s1字符串的长度
        System.out.println(s.equals(s1));//判断s和s1是否相等，就是是否一样，输出出来的是布尔型 是或否
        System.out.println(s1.substring(2,5));//截取2到4的字符
        System.out.println(s1.charAt(5));//第五个字符是啥
        System.out.println(s1.toUpperCase());//吧把所有的字符都变成大写
        System.out.println(s1.replace('o','l'));//把字符串里面的字符o都变成l
    }
}
//其实字符串就很像对象声明，或者说就是，就比如第一种声明字符串的方法（往上找第一个），然后下面就是对象调用的各种方法，这就相当于调用人家已经写好的方法，这些方法在哪呢？这玩意也自己去搜一下
//你们要搞懂一件事！String是不是基本数据类型！这个东西上网去查，并且加深印象
