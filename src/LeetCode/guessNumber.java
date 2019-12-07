//package LeetCode;
//
//public class guessNumber {
//    public int guessNumber(int n) {
//        int begin=0,end=n;
//        while (begin<=end){
//            int mid=begin+(end-begin)/2;
//            if (guess(mid)==-1){
//                end=mid;
//            }
//            else if (guess(mid)==1){
//                begin=mid+1;
//            }
//            else return mid;
//        }
//        return -1;
//    }
//}
