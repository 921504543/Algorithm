package heiheihei;
//a6讲构造方法
public class a6 {
    public static void main(String[] args) {//主方法
    car c=new car("red","bus");//创建一个颜色是红色，类型为公交车的汽车c
        System.out.println("this car is a " +c.type);//输出他的类型
        System.out.println("this cars color is "+c.color);//输出他的颜色
    car d=new car("big","yellow","SUV");//这就是不同的参数个数调用不同的构造方法。
                                                           //另外注意构造方法是创建对象时就调用，不同参数个数调用不同构造方法
        System.out.println(d.style +" "+d.type+" "+d.color);
    }
}
class car{
    String color,type;//声明颜色，类型
    public car(String color,String type){//构造方法，详细的构造方法事项可以去查，这里我只说 构造方法没有返回值这种东西连void也没有，方法名和类名相同，构造方法之间的区别是括号里面的参数，调用的参数填了几个，就调用哪个。
         this.color=color;//对变量进行初始化，this.color指的是全局变量color， 没有this的color指的是你传入的参数，既付给color的值
         this.type=type;//同上
    }
    String style;
    public car(String style,String color,String type){
        this.color=color;
        this.type=type;
        this.style=style;
    }
}
//练习：我要一直黄色的拉布拉多，长毛的，会喵喵的叫（看a5），同时我要一只卷毛的秋田犬，
