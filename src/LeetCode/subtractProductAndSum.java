package LeetCode;

public class subtractProductAndSum {
        public int subtractProductAndSum(int n) {
            String trans= String.valueOf(n);
            int multi=1;
            int sum=0;
            for (int i=0;i<trans.length();i++){
                multi*=Integer.parseInt(String.valueOf(trans.charAt(i)));
                sum+=Integer.parseInt(String.valueOf(trans.charAt(i)));
            }
            int result=multi-sum;
            return result;
        }
}
