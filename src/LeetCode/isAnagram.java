package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> t1=new HashMap<>();
        if (s.length()!=t.length())return false;
        for (int i=0;i<s.length();i++){
            if (s1.containsKey(s.charAt(i))){
                s1.put(s.charAt(i),s1.get(s.charAt(i))+1);
            }
            else s1.put(s.charAt(i),1);
        }
        for (int i=0;i<t.length();i++){
            if (t1.containsKey(t.charAt(i))){
                t1.put(t.charAt(i),t1.get(t.charAt(i))+1);
            }
            else t1.put(t.charAt(i),1);
        }
        Object []keyArr =s1.keySet().toArray();
        Object []keyArr1=t1.keySet().toArray();
        Arrays.sort(keyArr);
        Arrays.sort(keyArr1);
        for (int i=0;i<keyArr.length;i++){
            if (!s1.get(keyArr[i]).equals(t1.get(keyArr1[i]))){
                return false;
            }
            else if (!keyArr[i].equals(keyArr1[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
