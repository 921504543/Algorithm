package ACM;

import java.util.Arrays;
import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int n=reader.nextInt();
        int s=reader.nextInt();
        int []p=new int[n];
        for (int i=0;i<p.length;i++){
            p[i]=reader.nextInt();
        }
        Arrays.sort(p);
        int sum=0,count=0;
        for (int i=0;i<n;i++){
            sum+=p[i];
            count++;
            if (sum>=s){
                break;
            }

        }
        if (sum==s){
            System.out.println(count);
        }
        else {
            for (int i=count-1;i>=0;i--){
            if (sum-p[i]>=s){
                sum-=p[i];
                count--;
            }

        }
            System.out.println(count);
        }
    }
}
