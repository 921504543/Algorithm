package LeetCode;

public class search {
    public int search(int[] nums, int target) {
        int begin=0,end=nums.length-1;
        while (begin<=end){
            int mid=(begin+end)/2;
            if (nums[mid]<target){
                begin=mid+1;
            }
            else if (nums[mid]>target){
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
//mid=low+(high-low)/2可以防止溢出；
