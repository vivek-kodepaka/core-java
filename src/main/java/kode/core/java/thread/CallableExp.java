package kode.core.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExp {

    public static void main(String[] args) throws Exception {
        Callable<Integer> callable = ()-> {return 10;};
        System.out.println(callable.call());

        ExecutorService ex = Executors.newFixedThreadPool(5);
        Future<String> fu = ex.submit(()->{return "callble";});
        System.out.println(fu.get());
    }
}
