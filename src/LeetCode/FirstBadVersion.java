package LeetCode;

public class FirstBadVersion {
    public boolean isBadVersion(int i){
        return false;
    }
    public int firstBadVersion(int n) {
        if (isBadVersion(1))return 1;//第一个返回1；
        int begin=1,end=n;//给定前后指针
        int mid;//中位
        while (begin<end){//当前指针小于后指针
            mid=begin/2+end/2;//mid
            if (isBadVersion(mid)) end=mid;//如果是坏版本，继续寻找
            else begin=mid+1;//不是就begin找mid的下一个 ，直到锁定到最后一个
        }
        return begin;
    }
}
