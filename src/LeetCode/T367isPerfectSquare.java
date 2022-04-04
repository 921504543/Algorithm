package LeetCode;

public class T367isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int n=(int)Math.sqrt(num);
        return n*n==num;
    }
}
