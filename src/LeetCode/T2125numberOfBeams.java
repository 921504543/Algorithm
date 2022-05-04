package LeetCode;

public  class T2125numberOfBeams {
    public static int numberOfBeams(String[] bank) {
        int[] count=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int count1=0;
            for(int j =0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count1++;
                }
            }
            count[i]=count1;
        }
        int i=0;
        int j=1;
        int sum=0;
        while(i<count.length-1){
            while(count[i]==0){
                i++;
                if(i==count.length-1){
                    break;
                }
            }
            j=i+1;
            while(j<count.length){
                if(count[j]==0){
                    j++;
                }else {
                    break;
                }
            }
            if(j!=count.length){
                sum+=count[i]*count[j];
            }
            i++;
            j=i+1;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] bank=new String[]{"0","0"};
        numberOfBeams(bank);
    }
}
