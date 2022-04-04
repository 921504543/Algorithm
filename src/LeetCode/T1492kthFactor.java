package LeetCode;

public class T1492kthFactor {
    public int kthFactor(int n, int k) {
        int[] list=new int[1000];
        int location=0;
        for(int i =1;i<n+1;i++){
            if(n%i==0){
                list[location]=i;
                location++;
            }

        }
        if(list[k-1]==0){
            return  -1;
        }
        else{
            return list[k-1];
        }
    }
}
