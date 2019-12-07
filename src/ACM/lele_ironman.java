import java.util.Scanner;

public class lele_ironman {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
         int d=a>b?(b>c?c:b):(a>c?c:a);
        System.out.println(d);

    }
}
