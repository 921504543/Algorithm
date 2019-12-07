package LeetCode;

public class findJudge {
    public int findJudge(int N, int[][] trust) {
        int [][]a=new int[N][2];
        for (int i=0;i<trust.length;i++){
            int out=trust[i][0];
            int in=trust[i][1];
            a[out-1][0]++;
            a[in-1][0]++;
        }
        for (int i=0;i<a.length;i++){
            if (a[i][0]==0&&a[i][1]==N-1){
                return i+1;
            }
        }
        return -1;
    }
}
