package heiheihei;

public class a5 {
    public static void main(String[] args) {//主方法
     dog a=new dog();//有个狗叫a ，我们新养这只狗
     a.foke();//a的叫声，调用狗里面的叫声foke
     System.out.println("分割线");//分割线
     a.jump();//a的跳，调用狗的跳
    }

}
class dog{//定义狗的叫声是怎么样的，这时候，狗是泛指，并没有指明是狗a
    void foke(){//是条狗就这么叫
        System.out.println("wang wang wang ");
    }
    void jump(){//狗的跳动作
        System.out.println("我在跳嘿嘿嘿");
    }
}
//此时回去看a4，搞懂scanner是个什么东西，reader是个什么东西，nextInt是个什么东西
//另外a5我用了两个class，也就是说我写了两个文件，一个文件是狗类，一个是我的狗的实例化