package LeetCode;

public class isPowerOfThree {
    public static boolean isPowerOfThree(int n){
        String s=Integer.toString(n,3);
        System.out.println(s);
        if (s.charAt(0)=='1'){
            if (s.substring(1).contains("1")||s.substring(1).contains("2"))return false;
            else return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        isPowerOfThree(45);
    }
}
