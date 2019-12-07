package heiheihei;

public class a7 {
    public double radius;//声明一个公共的双精度半径
    public int height;//声明一个整型的高度
    double pai=3.14;//双精度的π
   public a7 (double r,int h){//这个是构造方法，是一个模子，这个模子里面要求有半径和高度
       radius=r;//给radius赋值，赋值赋的是r参数的值，这时候就是你们导论里学的，按值传参
       height=h;//同理
   }
   public double volume(){//求体积，他也是一个模子，像是一个公式，你把半径和高度带进去就是他的体积
       return pai*radius*radius*radius*height;//返回值，差不多是算出来的值
   }
    public static void main(String[] args) {
        a7 a=new a7(4,6);//用模子刻出来一个叫a的圆柱
        a7 b=new a7(5,8);//用模子刻出来叫b的圆柱
        System.out.println(a.volume());//套用公式求出a的体积，此时就要用a这个对象调用volume这个公式
        System.out.println(b.volume());
    }
}
//搞清楚a.volume是如何传参的
// 尝试造出来一个c圆柱，通过调用方法求得c圆柱的底面积
