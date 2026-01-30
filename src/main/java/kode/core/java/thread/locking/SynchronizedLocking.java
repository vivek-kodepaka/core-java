package kode.core.java.thread.locking;

import java.util.concurrent.CountDownLatch;

public class SynchronizedLocking {

    static int  static_count = 0;
    int instance_count=0;
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(30000);
        for(int i=0 ;i<10000;i++){

            new Thread(()->{
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                classLevel();
                latch.countDown();
            }).start();
        }
        SynchronizedLocking ins1 = new SynchronizedLocking();
        for(int i=0 ;i<10000;i++){
            new Thread(()->{
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ins1.instanceLevel();
                latch.countDown();
            }).start();
        }

        SynchronizedLocking ins2 = new SynchronizedLocking();
        for(int i=0 ;i<10000;i++){
            new Thread(()->{
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ins2.instanceLevel();
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("static count: "+ static_count);
        System.out.println("instance: "+ ins1.instance_count);
        System.out.println("instance: "+ ins2.instance_count);

    }

    static synchronized void classLevel(){
        static_count++;
    }

    synchronized void instanceLevel(){
        instance_count++;

    }
}
