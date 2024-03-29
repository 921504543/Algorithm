package LeetCode;

import java.util.Iterator;
public class MyHashSet {
    boolean []a;
    public MyHashSet() {
        a =new boolean[1000000];
    }

    public void add(int key) {
        a[key]=true;
    }

    public void remove(int key) {
        a[key]=false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return a[key];
    }
    public interface Iterable<T> {
        Iterator<T> iterator();
    }

}
