package LeetCode;

public class numJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        char[]a=J.toCharArray();
        char[]b=S.toCharArray();
        int count=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i]==b[j]) count++;
            }
        }
        return count;
    }
}
