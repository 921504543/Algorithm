package 蓝桥;
/* A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
        下图就是一种排法（如有对齐问题，参看p1.png）。

              A
             9 6
            4   8
           3  7   5  2

        这样的排法可能会有很多。

        如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

        请你计算并提交该数字。

        注意：需要提交的是一个整数，不要提交任何多余内容。
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a2018_1 {
    public static void main(String[] args) {
        Integer []a=new Integer[9];
        int i=0;
        int count=0;
        for (a[0]=1;a[0]<10;a[0]++){
            for (a[1]=1;a[1]<10;a[1]++){
                for (a[2]=1;a[2]<10;a[2]++){
                    for (a[3]=1;a[3]<10;a[3]++){
                        for (a[4]=1;a[4]<10;a[4]++){
                            for (a[5]=1;a[5]<10;a[5]++){
                                for (a[6]=1;a[6]<10;a[6]++){
                                    for (a[7]=1;a[7]<10;a[7]++){
                                        for (a[8]=1;a[8]<10;a[8]++){
                                            List<Integer> list=new ArrayList<Integer>();
                                            list=Arrays.asList(a);
                                            if (list.size()==a.length&&a[1]+a[2]+a[3]+a[0]==a[3]+a[4]+a[5]+a[6]&&a[6]+a[7]+a[8]+a[0]==a[3]+a[4]+a[5]+a[6]) {
                                                count++;
                                            }
                                        }}}}}                  }                        }
                }
            }
        System.out.println(count);


        }
    }

