package 蓝桥;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
    import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader=new Scanner(new BufferedInputStream(System.in));
        long a=reader.nextLong();
        long sum=((1+a)*a)/2;
        System.out.println(sum);
    }
}
