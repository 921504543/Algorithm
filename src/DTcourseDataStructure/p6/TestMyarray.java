package DTcourseDataStructure.p6;
import DTcourseDataStructure.p6.util.MyArray;

import java.util.Arrays;

public class TestMyarray {
    public static void main(String[] args) {
        MyArray m =new MyArray();
        int size=m.size();
        System.out.println(size);
        m.show();
        m.append(2);
        m.append(3);
        System.out.println(m.size());
//        打印元素到控制台
        m.show();
//        m.remove(0);
//        m.show();
        System.out.println(m.get(1));
        m.insert(1,66);
        m.show();
    }
}
