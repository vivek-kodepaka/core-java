package kode.core.java.collections.set;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        //todo unordered + no duplicates
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2000);
        set.add(2);
        set.add(6);
        set.add(1000);
        set.add(2);
        set.add(28);
        set.add(1);
        set.add(4);
        set.add(3);

        System.out.println(set);
        
    }
}
