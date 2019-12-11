package NowCoder;

import java.util.Scanner;

//首先fn=f(n/2)+f(n%2) 求fn是需要递归来求得，
//因为n%2要么1 要么2，所以等同于arg&1，少一个递归 类似斐波那契数列，每一个最小的都是在奇数的上面
public class qsProgression {
    public static long digui(long arg){
        if (arg<=1)return arg;
        return digui(arg/2)+(arg%2);
    }
    public static long min( long j)
    {
        if(j==0)
            return 0;
        else if(j==1)
            return 1;
        else
            return min(j-1)*2+1;
    }
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
       int cishu=reader.nextInt();
        for (int i=0;i<cishu;i++){
            long fn=digui(reader.nextLong());
            System.out.println(fn+" "+min(fn));
        }
    }
}
//不知道哪错了
