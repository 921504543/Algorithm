package heiheihei;//包 类比于文件夹

public class a1 { //类  class 是类的意思 类比于文件  public是公共的意思  每个程序都必须要有一个public class 也就是必须要有一个公共类
                  //类里面有两种东西 一种是变量 一种是方法
    public static void main(String[] args) {//这东西是主方法，public 公共的意思，static是静态的意思，void是无返回值，main是主方法，括号里面的是参数，具体什么意思自己百度，也可以不理解
                                            //主方法是一个程序最先运行的方法，看一个程序首先看主方法，其他的方法都是从主方法调用的。
        System.out.println("hello world");//这句话是输出的意思，类比于c语言中的printf，不同点是不需要地址，直接放字符串等
        sum(1 ,2);//调用sum方法（函数）
        System.out.println(sum(1,2)+"笨蛋");//输出加和，加号是表连接，自己体验一下加号

    }
     static int  sum(int a,int b){ //静态方法，如果等不及可以自己去搜，返回值为int整型，方法名叫sum，里面是参数，a和b，
      a=1;//声明变量
      b=2;
     return a+b; //返回值，也就是说像个计算器一样，返回出a，b的加和，sum方法就代替成a+b的值了，这个a+b的值要满足上面那个返回值为整型的条件
    }
}
//有兴趣自己了解String[] args ，有兴趣了解一下static，有兴趣了解一下public，如果没兴趣就先写着，以后慢慢就懂了，
// 自己写一下：最后输出出来的样式是：“两个数的平均数是：5”，用一个输出语句，练习使用加号。
//记得用方法，然后从主方法中调用averge方法
