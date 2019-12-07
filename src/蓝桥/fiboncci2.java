package 蓝桥;

import java.util.Scanner;
public class fiboncci2 {
    int []arr=new int[1000000];
    public int  f(int i){
        arr[1]=1;
        arr[2]=1;
        for(int j=3;j<i+1;j++){
            arr[j]=(arr[j-1]+arr[j-2])%10007;
        }
        int b=arr[i];
        return b;
    }

    public static void main(String[] args) {

        Scanner reader =new Scanner(System.in);
        fiboncci2 a=new fiboncci2();
        int b=reader.nextInt();

        System.out.println(a.f(b));
    }
}
