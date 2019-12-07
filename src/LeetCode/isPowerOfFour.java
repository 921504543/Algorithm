package LeetCode;

public class isPowerOfFour {
    public boolean isPowerOfFour(int n){
        if ((n&(n-1))==0){
            return false;
        }
        return n%3==1;
    }
}
