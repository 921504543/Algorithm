package LeetCode;

public class countSegments {
    public int countSegments(String s) {
        String []s1=s.split(" ");
        int count=0;
        for (int i=0;i<s1.length;i++){
            if (s1[i].equals("")){
                count++;
            }
        }
        return s1.length-count;
    }
}
