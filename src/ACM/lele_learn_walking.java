package ACM;

import java.util.Scanner;

public class lele_learn_walking {
    public static void main(String[] args) {
        Scanner reader =new Scanner( System.in);
        int n=reader.nextInt();
        int []a=new int[n];
        char []b=new  char[n];
        for (int i=0;i<n;i++){
            a[i]=reader.nextInt();
            b[i]=(char)a[i];
        }
        for (int i=0;i<n;i++){
            System.out.print(b[i]);
        }
    }
}
