package kode.core.java.collections.list.arrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        loadData(ll);
        //System.out.println(ll.get(5));

        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(10);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(1);
        System.out.println(linkedBlockingQueue);


    }

    public static void loadData(List<Integer> ll){
        for(int i=1;i<=10;i++){
            ll.add(i);
        }
    }
}
