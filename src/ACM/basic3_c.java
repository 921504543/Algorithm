package ACM;

import java.util.Scanner;

public class basic3_c {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int N=reader.nextInt();
        int []a=new int[N];
        a[0]=99999999;
        int sum=0;
        for (int i=1;i<N;i++){
            int num=reader.nextInt();
            a[num]=num;
        }
        for (int i=1;i<N;i++){
            if (a[i]==0)    sum=i;
        }
        System.out.println(sum);

    }
}
