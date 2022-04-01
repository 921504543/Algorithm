package DTcourseDataStructure;
import DTcourseDataStructure.p6.util.MyArray;
public class p8test {
    public static void main(String[] args) {
        MyArray arr=new MyArray();
        arr.append(1);
        arr.append(2);
        arr.append(3);
        arr.append(4);
        arr.append(5);
        System.out.println(arr.search(3));
        System.out.println(arr.binarySearch(3));
    }
}
