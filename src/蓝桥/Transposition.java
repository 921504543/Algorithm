package 蓝桥;

import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int M=in.nextInt();
        int N=in.nextInt();
        int [][]a=new int[M][N];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
            }
        }
        for (int i=0; i<M;i++){
            for (int j=0;j<N;j++){
                int m=a[j][i];
                a[i][j]=a[j][i];
                a[j][i]=m;
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
        }
}
