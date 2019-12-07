package ACM;

import java.util.Arrays;
import java.util.Scanner;

public class basic6_c {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        int m=in.nextInt();
        A [] arr = new A [m];
        for(int i=0;i<3;i++)
        {
            arr[i]=new A();       //关键一步  类对象必须初始化 分配内存空间
        }
        for (int i=0;i<m;i++){
            arr[i].a=in.nextInt();
        }
        for (int i=0;i<m;i++){
            arr[i].b=in.nextInt();
        }
        Arrays.sort(arr);
        for (int i =0;i<m;i++){
            System.out.println(arr[i].a);
            System.out.println(arr[i].b);
        }
}
}
class A implements  Comparable{
    int a;
    int b;
    public int compareTo(Object o) {
        A s=(A) o;
        return b>s.b?1:(b==s.b?0:-1);
    }
}

