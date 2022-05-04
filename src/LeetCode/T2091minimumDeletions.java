package LeetCode;

public class T2091minimumDeletions {
    public static int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }else if(nums.length==2){
            return 2;
        }
        int min_min_front=-1;
        int min_min_end=-1;
        int min_max_front=-1;
        int min_max_end=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int min_index=-1;
        int max_index=-1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                max_index=i;
            }
            if(nums[i]<min){
                min=nums[i];
                min_index=i;
            }
        }
        // 8-5
        min_min_front=min_index+1;
        min_min_end=nums.length-min_index;
        min_max_front=max_index+1;
        min_max_end=nums.length-max_index;
        int left=Math.max(min_min_front,min_max_front);
        int right=Math.max(min_min_end,min_max_end);
        int zonghe=
                Math.min(min_min_front,min_max_front)+Math.min(min_min_end,min_max_end);
        return Math.min(Math.min(left,right),zonghe);
    }

    public static void main(String[] args) {
        int[] nums= {-1,-53,93,-42,37,94,97,82,46,42,-99,56,-76,-66,-67,-13,10,66,85,-28};
        System.out.println(minimumDeletions(nums));
    }
}
