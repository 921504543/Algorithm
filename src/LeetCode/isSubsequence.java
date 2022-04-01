package LeetCode;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
    int i =-1;
        for (char c:t.toCharArray()){
        i=s.indexOf(i+1,c);
            i++;
        }
        if (i==s.length()){
            return true;
        }

    return false;
    }

}
