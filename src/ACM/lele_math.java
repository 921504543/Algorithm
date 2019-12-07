package ACM;

import java.util.Scanner;

public class lele_math {
    public static void main(String[] args) {
        Scanner readder =new Scanner(System.in);
        int a= readder.nextInt();
        int n=2;
        if (a%2==0){
            while (n<=a&&a%n!=0){
                n*=2;
            }
            System.out.println(n/2);
        }
        else
            System.out.println(1);
    }
}
