package LeetCode;

public class isMonotonic {
    public boolean isMonotonic(int[] A) {
        boolean a=true;
        for (int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                a=false;
                break;
            }
        }
        if (a){
            return a;
        }
        boolean b=true;
        for (int i=1;i<A.length;i++){
            if (A[i]<A[i-1]){
                b=false;
                break;
            }
        }
        return a||b;

    }
}
