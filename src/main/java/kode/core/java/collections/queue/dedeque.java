package kode.core.java.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dedeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(2000);
        deque.addFirst(2);
        deque.addLast(6);
        deque.addLast(1000);
        deque.add(2);
        deque.add(28);
        deque.addFirst(1);
        deque.add(4);
        deque.add(3);

        System.out.println(deque);
    }
}
