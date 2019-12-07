import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        String a=new DecimalFormat("#.00").format(3.1415926);
        double c=(double)Math.round(3.1566 * 10) * 0.1;
        System.out.println(a);
        System.out.printf("%.1f",c);
    }
}
