package LeetCode;

import java.util.Scanner;
//这样写阶乘会超位数
public class T172trailingZeroes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int temp=i;
            while(temp%5==0){
                temp/=5;
                count++;
            }
        }
        System.out.println(count);
    }

}
