package kode.core.java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //todo ordered + duplicates

        List<Integer> ls = new ArrayList<>();
        ls.add(5);
        ls.add(2);
        ls.add(6);
        ls.add(1);
        ls.add(1);
        ls.add(4);
        ls.add(3);

        System.out.println(ls);
    }
}
