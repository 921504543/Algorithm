package LeetCode;

public class countPrimeSetBits {
    public static int countPrimeSetBits(int L, int R) {
        int a[]={ 2, 3, 5, 7, 11, 13, 17, 19};
        int res=0;
        while (L<=R){
            int sum=0;
            String num=Integer.toString(L,2);
            System.out.println(num);
            for (int i=0;i<num.length();i++){
                if (num.charAt(i)=='1'){
                sum++;
                }
            }
            System.out.println(sum);
            for (int i=0;i<a.length;i++){
                if (a[i]==sum){
                    res++;
                    break;
                }
            }
            L++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(842,888));
    }
}
