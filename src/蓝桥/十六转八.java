package 蓝桥;

import java.math.BigInteger;
import java.util.Scanner;

public class 十六转八 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int a=reader.nextInt();
        String s;
        for (int i=0;i<a;i++){
            s=reader.next();
        BigInteger b= new BigInteger(s,16);
            System.out.println(b.toString(8));
        }

    }
}
