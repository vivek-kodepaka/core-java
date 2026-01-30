package kode.core.java.thread.course;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static final int MAX_PLATFORM=5_00_000;
    public static final int MAX_VIRTUAL=5_00_000;

    public static void main(String[] args) throws InterruptedException {
        virtualThread1();
    }

   static void threadDemo1(){
        for(int i=0;i<MAX_PLATFORM;i++){
            int j=i;
            Thread t = new Thread(()->{

                try {
                    Task.ioIntensive(j);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t.start();
        }
    }

   //virtual thread

   static void virtualThread1() throws InterruptedException {
       CountDownLatch latch = new CountDownLatch(MAX_PLATFORM);
        for(int i=0 ;i<MAX_VIRTUAL;i++){
            int num = i;
            Thread t = Thread.ofVirtual().name("virtual-thread",10).start(()->{

                try {
                    Task.ioIntensive(num);
                    latch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }) ;
        }
        latch.await();


   }
}
