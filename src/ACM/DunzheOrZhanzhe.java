package ACM;

import java.util.Scanner;

public class DunzheOrZhanzhe {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while (reader.hasNext()){
            int T=reader.nextInt();
            while (T-->0){
                int N=reader.nextInt();
                int A=reader.nextInt();
                int B=reader.nextInt();
                int j=1;
                int sum =B-A+1;
                while (j*j<=B){
                    if (j*j>=A){
                        sum--;
                    }
                    j++;
                }
                System.out.println(sum);
            }
        }
    }
}
