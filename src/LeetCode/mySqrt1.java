package LeetCode;
import java.lang.Math;
public class mySqrt1 {
    public int mySqrt(int x) {
        int begin=0;
        int end=x;
        while (begin<end){
            int mid=begin+(end-begin)/2;
            if (mid*mid>x){
                end=mid;
            }
            else if (mid*mid<=x) {
                begin = mid + 1;
            }
        }
        return end-1;
    }
}
