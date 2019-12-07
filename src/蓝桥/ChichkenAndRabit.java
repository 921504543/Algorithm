package 蓝桥;
//鸡兔同笼 穷举法
import java.util.Scanner;

public class ChichkenAndRabit {
    public void countofchicken(int head,int foot){
        int i,j;
        for (i=0;i<head;i++){
            j=head-i;
            if (2*i+4*j==foot){
                System.out.println("鸡的数量是"+i+",兔的数量是"+j);
            }
        }
    }

    public static void main(String[] args) {
        ChichkenAndRabit a=new ChichkenAndRabit();
        int e,f;
        Scanner reader =new Scanner(System.in);
        e=reader.nextInt();
        f=reader.nextInt();
        a.countofchicken(e,f);
    }
}
