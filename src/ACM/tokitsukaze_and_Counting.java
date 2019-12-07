package ACM;

import java.util.Scanner;

public class tokitsukaze_and_Counting {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        while (reader.hasNext()) {
            int T = reader.nextInt();
            while (T-->0){
            long L = reader.nextLong();
            long R = reader.nextLong();
            long x = reader.nextLong();
            System.out.println((R - L + 1) / x);
            }
        }
    }
}
