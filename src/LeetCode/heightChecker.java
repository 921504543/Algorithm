package LeetCode;

import java.util.Arrays;

public class heightChecker {
    public int heightChecker(int[] heights) {
        int index=0;
        int []a=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        for (int i=0;i<a.length;i++){
            if (a[i]!=heights[i]){
                index++;
            }
        }
        return index;
    }
}
