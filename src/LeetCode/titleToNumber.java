package LeetCode;

public class titleToNumber {
    public int titleToNumber(String s) {
        int res=0,len=s.length();
        for(int i=0;i<s.length();i++){
            res+=(s.charAt(len-i-1)-'A'+1)*Math.pow(26,i);
        }
        return res;
    }
}
