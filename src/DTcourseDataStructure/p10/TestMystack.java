package DTcourseDataStructure.p10;
import DTcourseDataStructure.p10.util.Mystack;
import DTcourseDataStructure.p6.util.MyArray;

public class TestMystack {
    public static void main(String[] args) {
        Mystack mystack=new Mystack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.peek();
    }
}
