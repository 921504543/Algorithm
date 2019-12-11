package LeetCode;

//分数不断取倒数，可以一直最简
public class fraction {
    public int[] fraction(int[] cont) {
        if (cont.length==1){
            return new int[]{cont[0],1};
        }
        int m =0;
        int n=1;
        int temp=0;
    for(int i=cont.length-1;i>1;i--){
        m=cont[i];
        n=cont[i-1]*cont[i]+n;
        temp=m;
        m=n;
        n=temp;
        cont[i-1]=m;
    }
    m=cont[1];
    n=cont[0]*m+n;

    return new int[]{n,m};
    }
}
