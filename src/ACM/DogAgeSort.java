import java.util.Arrays;
import java.util.Comparator;

public class DogAgeSort {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog("小黄",2), new Dog("小绿",1), new Dog("小黑",3) , new Dog("小红",6)};
        Arrays.sort(dogs, new DogComparator());

        for(Dog dog: dogs){
            System.out.println(dog);
        }

    }

}
 class DogComparator implements Comparator<Dog> {

    public int compare(Dog o1, Dog o2) {
        if(o1.getAge()<o2.getAge()){
            return -1;
        }else if(o1.getAge()>o2.getAge()){
            return 1;
        }else{
            return 0;
        }
    }}
 class Dog {

    private String name;
    private int age;


    public Dog() {}
    public Dog(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }

}
