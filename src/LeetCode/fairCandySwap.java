package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class fairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int []res=new int[2];
        int suma=0,sumb=0;
        for (int i=0;i<A.length;i++){
            suma+=A[i];
        }
        for (int i=0;i<B.length;i++){
            sumb+=B[i];
        }
        int dis=(sumb-suma)/2;
        Set b=new HashSet();
        for (int i=0;i<B.length;i++){
            b.add(B[i]);
        }
        for (int i =0;i<A.length;i++){
            if (b.contains(A[i]+dis)){
                res[0]=A[i];
                res[1]=A[i]+dis;
            }

        }
        return res;
    }
}
