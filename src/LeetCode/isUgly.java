package LeetCode;

public class isUgly {
    public boolean isUgly(int num) {
        if (num<=0)return false;
        if (num==0) return true;
        boolean flag=true;
        while (num!=1&&flag){
            flag=false;
        if (num%2==0){
            num/=2;
            flag=true;
        }
        if (num%3==0){
            num/=3;
            flag=true;
        }
        if (num%5==0){
            num/=5;
            flag=true;
        }
        }
        return flag;
    }
}
