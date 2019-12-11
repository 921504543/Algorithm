package NowCoder;

import java.util.Scanner;

public class TheBiggestWaterProblem {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        System.out.println(big(reader.nextInt()));
    }
    public static int big(int i){
        while (i>=10){
            String string=Integer.toString(i);

            int sum=0;
            for (int j=0;j<string.length();j++){
                sum+=Integer.parseInt(String.valueOf(string.charAt(j)));
            }
            i=sum;
        }
        return i;
    }

}
