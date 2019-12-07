package ACM;

        import java.util.Arrays;
        import java.util.Scanner;

public class basic1_2 {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        int n=reader.nextInt();
        int []a=new int[n+1];
        for (int i=1;i<=n;i++){
            a[i]=reader.nextInt();
        }
        Arrays.sort(a);
        int m=0;
        int x=n;
        int sum=0;
        boolean flag= true;
        while (m+1<=x){
            sum+=(a[m]-a[x])*(a[m]-a[x]);
            if (flag){
                m++;
            }
            else{
                x--;

            }
            flag=!flag;
        }
        System.out.println(sum);
    }
}
