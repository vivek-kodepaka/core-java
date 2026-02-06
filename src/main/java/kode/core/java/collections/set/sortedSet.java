package kode.core.java.collections.set;

import java.util.*;

public class sortedSet {
    public static void main(String[] args) {
        // set(unordered+no-duplicates) + sorted-order

        SortedSet<Integer> set = new TreeSet<>();
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
