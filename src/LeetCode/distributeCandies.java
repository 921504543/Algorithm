package LeetCode;

import java.util.HashMap;

public class distributeCandies {
    public int distributeCandies(int[] candies) {
        HashMap<Integer,Integer>a =new HashMap<>();
        int num=0;
        for (int i=0;i<candies.length;i++){
            if (!a.containsKey(candies[i])){
                a.put(candies[i],1);
                num++;
            }
            if (num==candies.length/2){
                break;
            }
        }
        return num;
    }
}
