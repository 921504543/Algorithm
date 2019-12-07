package heiheihei;

public class jianmo1 {
    public static void main(String[] args) {
        int inner =101;
        String inner1=Integer.toString(inner);
        int length=inner1.length();
        int j=0;
        for (int i=0;i<length-2;i++){
            j=j+(int)Math.pow(10,i);
        }
        System.out.println(j+inner-(int)Math.pow(10,length-1));
    }
}
