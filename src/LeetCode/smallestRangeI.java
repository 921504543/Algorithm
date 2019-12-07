package LeetCode;

import java.util.Arrays;

public class smallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int result=A[A.length-1]-A[0]-2*K;
        return Math.max(0,result);
    }
}
