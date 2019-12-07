package ACM;

import java.util.Scanner;

public class month_11_j {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        int[] a = new int[3263];
        for (int i=1;i<3263;i++){
            a[i]=i*i;
        }
        for (int i=0;i<T;i++){
            int c=reader.nextInt();
            if (c<0){
                System.out.println(-1);
            }
            else {itcase:for (int j=3262;j>=1;j--){
                if (c%a[j]==0){
                    System.out.println(j+" "+c/a[j]);
                    break itcase;
                }
            }
            }
        }
    }
}
