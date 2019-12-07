package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class repeatedNTimes {
        public int repeatedNTimes(int[] A) {
            int res=-1;
            Set<Integer> a=new HashSet<>();
            for (int i=0;i<A.length;i++){
                if (!a.contains(A[i])){
                    a.add(A[i]);
                }
                else {
                    res = A[i];
                    break;
                }
            }
            return res;
        }
}
