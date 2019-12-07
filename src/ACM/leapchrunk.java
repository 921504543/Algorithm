package ACM;

    import java.util.Scanner;

    public class leapchrunk {
        public static void main(String[] args) {
            Scanner reader =new Scanner(System.in);
            while (reader.hasNext()){
            int n=reader.nextInt();
            int []a=new int[n];
            int min=0;
            int count=0;
            for (int i=0;i<a.length;i++){
                a[i]=reader.nextInt();
            }
            for (int i=0;i<a.length;i++){
                if (i==0){
                    count++;
                    min =a[i];
                }
                else {
                    if (min<=a[i]){
                        count++;
                        min=a[i];
                    }
                }
            }
            System.out.println(count);
        }}
    }
