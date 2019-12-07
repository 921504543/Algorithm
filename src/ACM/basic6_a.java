package ACM;

import java.util.Scanner;

public class basic6_a {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long m=in.nextLong();
        int c1;
        int flag=0;
        float f;
        int i=0;
        for (c1=0;i<=m;c1++){

             f=7*m-n+c1*(7*m-n+1);
              i=(int)f;
            if (n-6*m<=0) {
               flag=0;
                break;
            }
             if (i==f&&i<=m){
                 System.out.println(i);
                flag=1;
                 break;
             }
        }
        if (flag==0){
            System.out.println("jgzjgzjgz");
        }
    }

}
