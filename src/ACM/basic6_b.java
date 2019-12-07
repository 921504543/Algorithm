package ACM;

import java.util.Scanner;

public class basic6_b {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        long n =reader.nextLong();
        long m=reader.nextLong();
        long d=reader.nextLong();
        long x=reader.nextLong();
        long i;
        for ( i=0;i<=x;i++){
            if (m<=i*n+i*(i-1)/2*d)
                break;
        }
        System.out.println(i);
    }
}
