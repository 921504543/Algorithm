package LeetCode;

public class T326ThreeMi {
    public static void test(int n){
        System.out.println(n%3);
    }
    public static boolean isPowerOfThree(int n) {
        if (n==0){
            return false;
        }
        while (n%3==0){
            n=n/3;
        }
        if (n==1){
            return true;
        }
        else {return false;}
    }
    public static void main(String[] args) {
        System.out.println(        isPowerOfThree(19684));
//        isPowerOfThree(19684);
    }
}
