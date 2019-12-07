package 蓝桥;

public class DiguiTraining {
    public static int f(int []a,int begin){
        if (begin==a.length){
            return begin;
        }
        int x=f(a,begin+1);
        return x+a[begin];
    }

    public static void main(String[] args) {
        int []a={1,5,1,9,5,6,4};
        System.out.println(f(a,0));
    }
}
