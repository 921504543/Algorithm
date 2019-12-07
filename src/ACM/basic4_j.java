package ACM;

import java.util.Scanner;

public class basic4_j {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int f1=reader.nextInt();
        int f2=reader.nextInt();
        int a=reader.nextInt();
        double f12=f1*f1;
        double f22=f2*f2;

        double h=Math.cos( Math.toRadians(180-a));
        double s=f12+f22-2*f1*f2*h;
        double f=Math.sqrt(s);
        System.out.println(f);
    }
}
