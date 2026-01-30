package kode.core.java.thread;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.*;

public class BlockingVsNonBlocking {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //callable+future --> blocking
        //completableFuture--> non-blocking

        ExecutorService ex = Executors.newFixedThreadPool(5);
        Future<String> fu = ex.submit(()->{
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "after 5 sec"+ " "+LocalTime.now();
        });
        System.out.println(fu.get());
        System.out.println("after blocking callbale future");


        ExecutorService ex1 = Executors.newFixedThreadPool(5);

        Future<String> fu1 = ex.submit(()->{
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "after 5 sec"+ " "+LocalTime.now();
        });
        System.out.println(fu.get());
        System.out.println("after blocking callbale future");
    }
}
