package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestWord {
    public String longestWord(String[] words) {
        String result="";
        Arrays.sort(words);
        Set a=new HashSet();
        for (String string :words){
            if (string.length()==1||a.contains(string.substring(0,string.length()-1))){
                result=result.length()>string.length()?result:string;
                a.add(string);
            }
        }
return result;
    }
}
