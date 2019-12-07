package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap=new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[]a=strs[i].toCharArray();
            Arrays.sort(a);
            String key=new String(a);
            if (!hashMap.containsKey(key)){
                hashMap.put(key,new ArrayList<>());
            }
            hashMap.get(key).add(strs[i]);
        }
        return new ArrayList<>(hashMap.values());
    }
}
