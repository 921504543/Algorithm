package LeetCode;

public class isOneBitCharacter {
    public static boolean isOneBitCharacter(int []bits){
        int count=0;
        if (bits[bits.length-1]!=0) return false;
        else {
            if (bits.length>1){
                int i=bits.length-2;
            while (i>=0&&bits[i]==1){
                count+=1;
                i--;
                System.out.println(count);
            }
            return count%2==0;
        }
            else {
                return bits[bits.length-1]==0;
            }
    }
  }

    public static void main(String[] args) {
        int []a={1,1,1,0};
        isOneBitCharacter(a);
    }
}
