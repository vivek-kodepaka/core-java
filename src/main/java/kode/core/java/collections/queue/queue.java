package kode.core.java.collections.queue;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class queue {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        for(int i:queue){

            if(i==2){
              queue.add(29);
              queue.remove(5);
            }
            System.out.println(i);
        }

        System.out.println(queue);
    }
}
