package kode.core.java.thread.locking;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExp {
    static int  static_count = 0;
    int instance_count=0;
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        CountDownLatch latch = new CountDownLatch(10000);

        for(int i=0;i<10000;i++){
            Thread t = new Thread(()->{
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if(lock.tryLock(100, TimeUnit.MILLISECONDS)){
                        try{

                            classLevel();
                        } finally {
                            lock.unlock();
                            latch.countDown();
                        }
                    }else {
                        latch.countDown();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });
            t.start();
        }
        latch.await();
        System.out.println("class-level count: "+static_count);

    }

    static  void classLevel(){
        //ReentrantLock lock = new ReentrantLock();
       // System.out.println("before " + Thread.currentThread().getName() + " "+ static_count);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        static_count++;
       // System.out.println("after " + Thread.currentThread().getName() + " "+ static_count);

    }

    synchronized void instanceLevel(){
        instance_count++;

    }
}
