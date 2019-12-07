package LeetCode;

public class diStringMatch {
    public static int[] diStringMatch(String S) {
        int max=S.length(),min=0;
        int []re=new int[S.length()+1];
        for (int i=0;i<S.length();i++){
            if (S.charAt(i)=='D'){
                re[i]=max;
                max--;
            }
            else if (S.charAt(i)=='I'){
                re[i]=min;
                min++;
            }
        }
        System.out.println(re[S.length()]);
        re[S.length()]=max;
        System.out.println(re[S.length()]);
        return re;
    }

    public static void main(String[] args) {
        diStringMatch("IDID");
    }
}
