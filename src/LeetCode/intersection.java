package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a=new HashSet<>();
        for (int num:nums1){
            a.add(num);
        }
        ArrayList<Integer> result =new ArrayList();
        for (int i=0;i<nums2.length;i++){
            if (a.contains(nums2[i])&&!result.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int []b=new int[result.size()];
        for (int i=0;i<b.length;i++){
            b[i]=result.get(i);
        }
        return b;
    }
}
