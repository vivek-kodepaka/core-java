package kode.core.java.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        List<Integer> sal = Collections.synchronizedList(new ArrayList<>());
        for(int i=0;i<20;i++){
            sal.add(i);
        }


        List<Integer> copyOnWriteArrayList   = new CopyOnWriteArrayList<>();
        for(int i=0;i<20;i++){
            copyOnWriteArrayList.add(i);
        }
        copyOnWriteForEach(copyOnWriteArrayList);



    }

    public static void copyOnWriteForEach(List<Integer> copyOnWriteArrayList){
        for(Integer l: copyOnWriteArrayList){
            copyOnWriteArrayList.add(3);
            System.out.println(l);
        }
        System.out.println(copyOnWriteArrayList);

    }

    public void usingFor(List<Integer> sal){
        int size = sal.size();
        for(int i=0;i<size;i++){
            System.out.println(sal.get(i));
            if(i==5)
                sal.remove(i+1);
        }
    }
    public void iterator(List<Integer> sal){
        Iterator<Integer> iterator = sal.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            sal.remove(7);
        }
    }
}
