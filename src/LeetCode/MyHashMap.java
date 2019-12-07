package LeetCode;

import java.util.Arrays;

public class MyHashMap {
    int []set;
    public MyHashMap() {
        set=new int[1000000];
        Arrays.fill(set,-1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        set[key]=value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return set[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        set[key]=0;
    }
}
