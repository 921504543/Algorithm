package DTcourseDataStructure;
//二分查找必须有序
public class p8BinarySearch {
    public static void main(String[] args) {
        //        目标数组
        int[]arr=new int[]{0,1,2,3,4,5,6,7,8,9};
//        目标元素
        int target=4;
        int index=-1;
//        开始定义中间开始结束
        int begin=0;
        int end=arr.length-1;
        int mid=(begin+end)/2;
        while (true){
//            △△△△△△如果开始大于结束或重合则说明arr中没有这个元素
            if (begin>=end){
                System.out.println(-1);
                break;
            }
            if (arr[mid]==target){
                index=mid;
                break;
            }
            else {
                if (target>arr[mid]){
                    begin=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            mid=(begin+end)/2;
        }
        System.out.println(index);
    }
}
