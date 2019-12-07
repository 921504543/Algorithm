package LeetCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> consult=new LinkedList<>();
        List<Integer> temper=new LinkedList<>();
        temper.add(1);
        consult.add(temper);
        if (numRows==1) return consult;
        temper.add(1);
        consult.add(temper);
        if (numRows==2) return consult;
        for (int i=2;i<numRows;i++){
            List<Integer> temper1=new LinkedList<>();
            temper1.add(1);
            for (int j=0;j<i;j++){
                temper1.add(temper.get(j)+temper.get(j));
            }
            temper1.add(1);
            consult.add(temper1);
            temper=temper1;
        }
        return consult;
    }
}
