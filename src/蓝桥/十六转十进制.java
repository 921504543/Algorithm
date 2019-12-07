package 蓝桥;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Integer.toHexString;

public class 十六转十进制 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        Integer a=reader.nextInt();
        System.out.println(toHexString(a).toUpperCase());
    }
}
