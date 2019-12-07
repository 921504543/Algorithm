package 蓝桥;

public class a01chuan {
    public static void main(String[] args) {
        String c=Integer.toBinaryString(00000);
        Integer d=Integer.parseInt(c);
        Integer e=d;
        while (e<=31){

            String s=Integer.toBinaryString(e);
            while (s.length()<5){
                s="0"+s;
            }
            System.out.println(s);
            e++;
        }
    }
}
