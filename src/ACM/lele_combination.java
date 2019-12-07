package ACM;

import java.util.Scanner;

public class lele_combination {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int count=0;
        for (int i=1;i<=a;i++)
            for (int j=1;j<=b;j++)
                if ((i+j)%7==0)
                    count++;
        System.out.println(count);
    }
}
