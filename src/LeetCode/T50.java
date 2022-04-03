package LeetCode;

public class T50 {
    public double myPow(double x, int n) {
         double result=1;

        for(int i=0;i<n;i++){
            result*=x;
        }
        return result;
    }
    public static void main(String[] args) {
        T50 test=new T50();
        System.out.println(test.myPow(2.10000,3));
    }
}
