package kode.core.java.thread;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MAin {

    public static void main(String[] args) {
        Student s = new Student();
        s.start();

        Thread t = new Thread(() -> System.out.println("inside runnable"));
        t.start();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) executorService;

        for(int i=1;i<100;i++){
            int taskid=i;
            executorService.execute(()-> {
                System.out.println( "thread-"+taskid+" "+Thread.currentThread().getName() +" "+ LocalDateTime.now());
                try {
                    System.out.println("poolsize" + poolExecutor.getPoolSize());
                    System.out.println("actice count"+ poolExecutor.getActiveCount());
                    System.out.println("completed tasl "+poolExecutor.getCompletedTaskCount());
                    System.out.println("queue size "+ poolExecutor.getQueue().size());
                    Thread.sleep(500*taskid);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }
}
