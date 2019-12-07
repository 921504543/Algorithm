package ACM;

import java.util.Scanner;

public class basic3_e {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long  T = reader.nextLong();
        int n;
        int m;
        int count;

        for (long  h=0;h<T;h++) {
             n = reader.nextInt();
             m = reader.nextInt();
            if (n%2==0){
                count=(n*m)-m-1;
            }
            else {
                count=(n*m)-2;
            }
            System.out.println(count);
        }

    }
}

