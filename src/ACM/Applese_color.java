package ACM;

import java.math.BigInteger;
import java.util.Scanner;

public class Applese_color {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        BigInteger n=reader.nextBigInteger();
        BigInteger m=reader.nextBigInteger();
        BigInteger a=new BigInteger("1000000007");
        n=n.mod(a.subtract(BigInteger.valueOf(1)));
        BigInteger er=BigInteger.valueOf(2);
        BigInteger result= er.modPow(n,a);
        System.out.println(result);
    }
}
