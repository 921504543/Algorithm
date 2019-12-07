package LeetCode;

public class mySqrt {
    public int mySqrt(int x) {
        if (x<0) return -1;
        else if (x==0) return 0;
        else return (int)Math.sqrt(x);
    }
}
