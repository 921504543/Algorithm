package LeetCode;

public class detectCapitalUse {
    public boolean detectCapitalUse(String word) {
        int da=0,xiao=0;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)>'A'&&word.charAt(i)<'Z'){
                da++;
            }
        }
        if (da==1&&word.charAt(0)>'A'&&word.charAt(0)<'Z'){
            return true;
        }
        else if (da==word.length()-1){
            return true;
        }
        else if (da==0) return true;
        else return false;
    }
}
