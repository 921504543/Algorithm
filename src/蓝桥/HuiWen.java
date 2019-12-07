package 蓝桥;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int sum = n - 2 * i - 2 * j;
                if (sum < 10&&sum>0) {
                    System.out.println(i + "" + j + "" + sum + "" + j + "" + i);
                }
            }
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                for (int k=1;k<10;k++){
                    if (2*i+2*j+2*k==n){
                        System.out.println(i+""+j+""+k+""+k+""+j+""+i);
                    }
                }
        }
        }
    }
}
