package LeetCode;

import java.util.HashSet;

public class isHappy {
    public boolean isHappy(int n) {
        HashSet<Integer> a=new HashSet<>();

        while(n!=1){
            int sum=0;
            while (n>0){
                sum=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
            if (!a.contains(n)) {
                a.add(n);
            }
            else {
                break;
            }
        }
        return n==1;
    }
}
