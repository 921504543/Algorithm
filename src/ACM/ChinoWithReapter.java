package ACM;

import java.math.BigInteger;
import java.util.Scanner;

public class ChinoWithReapter {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        BigInteger n=reader.nextBigInteger();
        BigInteger a=BigInteger.valueOf(1);
        int count=0;

        while (n.compareTo(a)==1){
            a=a.multiply(BigInteger.valueOf(2));

            count++;
        }
        System.out.println(count);
    }
}
