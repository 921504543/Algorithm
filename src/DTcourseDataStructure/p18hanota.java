package DTcourseDataStructure;
//思想是把最后一个上面的所有盘子看做是一个盘子，所以总体是看做两个盘子
public class p18hanota {
    public static void hanota(int n,char from,char in,char to){
        if (n==1){
            System.out.println("把第1个盘子从"+from+"移到"+to);
        }
        else {
            hanota(n-1,from,to,in);
            System.out.println("把第"+n+"个盘子从"+from+"移到"+in);
            hanota(n-1,in,from,to);
        }
    }

    public static void main(String[] args) {
        hanota(2,'A','B','C');
    }
}
