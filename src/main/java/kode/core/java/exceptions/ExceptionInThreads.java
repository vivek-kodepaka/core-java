package kode.core.java.exceptions;

public class ExceptionInThreads {
    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            new Thread(()->{
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                throw new RuntimeException("inside t1 exception thrown");
            }).start();

            throw new RuntimeException("t1 exception thrown");
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            throw new RuntimeException("t2 exception thrown");
        }).start();

        Thread.sleep(5000);

        System.out.println("main thread");

    }
}
