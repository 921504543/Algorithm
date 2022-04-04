package DTcourseDataStructure;

public class p17fibonacci {
    public int fibonacci(int i){
        if(i==1||i==2){
            return 1;
        }
//        找到通项然后从后往前，写好边界条件就可以了
        else {
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }

    public static void main(String[] args) {
        p17fibonacci f=new p17fibonacci();
        System.out.println(f.fibonacci(7));
    }

}
