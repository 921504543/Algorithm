package 蓝桥;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_sort {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int a=reader.nextInt();
        int i;
        long []arr=new long[a];
        for (i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        Arrays.sort(arr);
        for (i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
