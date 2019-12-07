package LeetCode;

public class canJump {
    public boolean canJump(int[] nums) {
        if (nums[0]==0)return false;
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i-1])-1;
            if (dp[i]<0){
                return false;
            }
        }
        return true;
    }
}
