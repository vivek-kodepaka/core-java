package kode.core.java.collections.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class navigableSet {
    public static void main(String[] args) {
        //todo sortedSet + set + navigation(nearest+range based)

        NavigableSet<Integer> set = new TreeSet<>();
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
        System.out.println(set.lower(1));
        System.out.println(set.higher(2));
        System.out.println(set.subSet(5,true,90,true));
    }
}
