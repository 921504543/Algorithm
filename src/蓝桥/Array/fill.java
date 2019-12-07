package 蓝桥.Array;

import java.util.Arrays;

public class fill {
    public static void main(String[] args) {
        char arr[] =new char[] {'1','8','6','1','2','3','4','5','6','7','8'};
        Arrays.fill(arr,3,7,'*');
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
