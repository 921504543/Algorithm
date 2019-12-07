package heiheihei;
import java.util.*;
public class 建模_2019 {
    public static void main(String[] args) {
        int n,m;
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            n=scanner.nextInt();//n个数字排序

            ArrayList<String> list=new ArrayList<String>();
            for(int i=0;i<n;i++)
                list.add(String.valueOf(i+1));
            Collections.sort(list);

            //输出list
            Iterator<String> iterator=list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next()+",");
            }
        }
    }
}

