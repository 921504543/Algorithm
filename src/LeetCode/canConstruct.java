package LeetCode;

import java.util.HashMap;

public class canConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int []a=new int [26];
        for (int i=0;i<magazine.length();i++){
            a[magazine.charAt(i)-97]++;
        }
        for (int i=0;i<ransomNote.length();i++){

            int c=a[ransomNote.charAt(i)-97];
            if (c==0)return false;
            else a[ransomNote.charAt(i)-97]--;

        }
        return true;
    }

    public static void main(String[] args) {
        canConstruct("aa","ab");
    }
}
