package ACM;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        while (reader.hasNext()){
            int a=reader.nextInt();
            int b=reader.nextInt();
            int c=reader.nextInt();
            System.out.println((int)(a*0.2+b*0.3+c*0.5));
        }
    }
}
