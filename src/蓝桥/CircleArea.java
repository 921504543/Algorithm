package 蓝桥;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double PI=Math.atan(1.0)*4;

        Scanner reader=new Scanner(System.in);
        int r=reader.nextInt();
        double a=PI*r*r;
        DecimalFormat g=new DecimalFormat("0.0000000");
        System.out.println(g.format(a));
    }
}
