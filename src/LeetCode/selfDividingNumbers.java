package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class selfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a =new LinkedList<>();
        while (left<=right){
            int num=left;
            while (num>0){
                if (num%10==0||left%(num%10)!=0){
                    break;
                }
            }
            if (num==0) a.add(left);
            left++;
        }
        return a;
    }
}
