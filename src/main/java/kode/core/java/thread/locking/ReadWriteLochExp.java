package kode.core.java.thread.locking;

import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLochExp {
   // static int stackSize= 5;
    static HashMap<String, String> cache = new HashMap<>();
    public static void main(String[] args) throws InterruptedException{
       // final HashMap<String,String > hashMap = new HashMap<>();
        cache.put("name","kode");
        CountDownLatch latch = new CountDownLatch(2000);
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        for(int i=0 ;i<1000;i++){
            String count  = String.valueOf(i);
            Thread thread = new Thread(()->{
                sleep(10000);
                write(cache,readWriteLock,count);
                latch.countDown();
            });
            thread.start();
        }

        for(int i=0 ;i<100000;i++){
            Thread thread = new Thread(()->{
                sleep(100);
                Read(cache,readWriteLock);
                latch.countDown();
            });
            thread.start();
        }


        latch.await();
    }



    static void sleep(long mills){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

   static void Read(HashMap<String,String> cache,ReadWriteLock readWriteLock){
       readWriteLock.readLock().lock();
       try{

           System.out.println("reading: "+ cache.get("name"));

       }finally {
           readWriteLock.readLock().unlock();
       }

    }

    static void write(HashMap<String,String> cache,ReadWriteLock readWriteLock,String count){
        readWriteLock.writeLock().lock();
        try{

            System.out.println("writing: "+ cache.put("name","vivek"+count));
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }




}
