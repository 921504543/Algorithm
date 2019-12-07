package LeetCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0,right=0;
        HashSet<Character> a=new LinkedHashSet<>();
        while (right<s.length()){
            if (!a.contains(s.charAt(right))){
                a.add(s.charAt(right));
                right++;
                max=Math.max(max,a.size());
            }
            else {
                a.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
