package LeetCode;

import java.util.*;

public class largeGroupPositions {
    public static List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> b=new ArrayList<>();
       for (int i=0;i<S.length();){
           int j=i;
           while (j<S.length()&&S.charAt(i)==S.charAt(j)) j++;
           if (j-i>2){
               List<Integer> a=new ArrayList<>();
               a.add(i);
               a.add(j-1);
               b.add(a);
           }
           i=j;
       }
        return b;
    }

    public static void main(String[] args) {
        String a="abcdddeeeeaabbbcd";
        largeGroupPositions(a);
    }
}
