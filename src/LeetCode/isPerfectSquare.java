package LeetCode;

import static java.lang.Math.pow;

public class isPerfectSquare {
    public  static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            if(pow(mid,2)>num)
            {
                end=mid-1;
            }
            else if(pow(mid,2)<num)
            {
                start=mid+1;
            }
            else return true;
            mid=(end-start)/2+start;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
}
