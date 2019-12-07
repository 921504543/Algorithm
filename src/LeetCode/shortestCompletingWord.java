package LeetCode;

import java.util.Arrays;

public class shortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate=licensePlate.toLowerCase();
        int sum=0;
        int min=Integer.MAX_VALUE;
        int index=-1;
        int []map1=new int [26];
        for (int i=0;i<licensePlate.length();i++){
            int a=licensePlate.charAt(i)-97;
            if (a>=0){
                map1[a]++;
                sum++;
            }
        }

        System.out.println(sum);
        for (int i=0;i<words.length;i++){
            for (int j=0;j<words[i].length();j++){
                int []map= Arrays.copyOf(map1,map1.length-1);
                int b=words[i].charAt(j)-97;
                if (b>=0&&map[b]>0){
                    map[b]--;
                    sum--;
                }
                if (sum==0){
                    if (words[i].length()<min) {
                        index = i;
                        min = words[i].length();
                    }
                }
            }
        }
        return words[index];
    }

    public static void main(String[] args) {
        String a= "Ah71752";

        String []b={"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
        System.out.println(shortestCompletingWord(a,b));
    }
}
