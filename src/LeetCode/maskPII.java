package LeetCode;

public class maskPII {
    public String maskPII(String S) {
        String lalal="";
        int leixing=panduan(S);
        if (leixing!=-1){
            S=S.toLowerCase();
            StringBuilder newS=new StringBuilder();
            newS=newS.append(S.charAt(0)).append("*****").append(S.charAt(leixing-1));
            S=S.substring(leixing);
            newS=newS.append(S);
            lalal=newS.toString();
        }
        else {
            StringBuilder temp=new StringBuilder();
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)>='0'&&S.charAt(i)<='9'){
                    temp.append(S.charAt(i));
                }
            }
            StringBuilder newS=new StringBuilder();
            if (S.length()>10){
                newS.append("+");
            }
        }
        return lalal;
    }
    public static int panduan(String S){
        for (int i=0;i<S.length();i++){
            if (S.charAt(i)=='@') return i;
        }
        return -1;
    }
}
