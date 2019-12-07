package 蓝桥;

import java.util.Scanner;
//f3=f1+f2
//第三个月的兔子等于第一三个月的总数
public class fiboncci {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int month=reader.nextInt();
        fiboncci a=new fiboncci();
        int num =a.NumOfRabit(month);
        System.out.println(num);
        }

    public int NumOfRabit(int  i){
    int yi,er;
    if (i==1||i==2){
        return 1;
    }
    else{
        yi=NumOfRabit(i-1);
        er=NumOfRabit(i-2);
        return yi+er;
    }

    }
}
