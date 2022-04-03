package LeetCode;

public class T69sqrt {
    public int mySqrt(int x) {
       if (x==1){
           return 1;
       }
        int min=0;
        int max=x;
        while (max-min>1){
            int m=(max+min)/2;
            if (x/m<m){
                max=m;
            }else {
                min=m;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        T69sqrt test=new T69sqrt();
        System.out.println(test.mySqrt(8));
    }
}
