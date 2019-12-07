package heiheihei;

import java.util.Scanner;

public class enter {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        String a=reader.nextLine();
        String[]b=a.split(">");
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]+">");
        }
    }
}
