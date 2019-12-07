package LeetCode;

public class fib {
    public int fib(int N) {
        if (N==0)return 0;
        if (N==1) return 1;
        int []f=new int[N+1];
        f[0]=0;
        f[1]=1;
        for (int i=2;i<f.length;i++){
            f[i]=f[i-1]+f[i-2];

        }
        return f[N];
    }
}
