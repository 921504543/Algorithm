package LeetCode;

import java.util.HashMap;

public class firstUniqchar {
    public static int firstUniqChar(String s) {
        char[] s1=s.toCharArray();
        HashMap<Character,Integer> a=new HashMap();
        for (int i=0;i<s1.length;i++){
            if (a.containsKey(s1[i])){
                a.put(s1[i],a.get(s1[i])+1);
            }
            else a.put(s1[i],1);
        }
        for (int i=0;i<s1.length;i++){
            if (a.get(s1[i])==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
