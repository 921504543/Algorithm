package LeetCode;

public class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int []dp=new int [nums.length];
        dp[0]=nums[0];
        int maxNum=nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
        }
        for (int j=0;j<nums.length;j++){
            maxNum=Math.max(maxNum,dp[j]);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int []a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}
