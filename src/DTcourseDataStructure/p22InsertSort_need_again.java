package DTcourseDataStructure;

import java.util.Arrays;
//i从1开始循环
//j是i的前一个
//判断arrs[j]是不是大于那个temp
//小于就跳出循环
//大于就不跳出，继续遍历

public class p22InsertSort_need_again {
    public static void main(String[] args) {
        int[] arrs=new int[]{5,3,4,7,1,2,8};
        for (int i = 1; i < arrs.length; i++) {
            int j;
          if (arrs[i]<arrs[i-1]){
              int temp=arrs[i];
//              成立的条件是 j大于等于0；且temp小于其前面的arrs[j]
              for (j = i-1;j>=0&&temp<arrs[j]; j--) {
                  arrs[j+1]=arrs[j];
              }
              arrs[j+1]=temp;
          }
        }
        System.out.println(Arrays.toString(arrs));
    }
}
