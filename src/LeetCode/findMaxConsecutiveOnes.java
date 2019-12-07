package LeetCode;

public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                int sum1=0;
                for (int j=i;j<nums.length;j++){
                    if (nums[j]==1) sum1++;
                    else break;
                }
                sum=Math.max(sum,sum1);
            }
        }
        return sum;
    }
}
