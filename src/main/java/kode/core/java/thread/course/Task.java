package kode.core.java.thread.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class Task {
    private static final Logger log = LoggerFactory.getLogger(Task.class);
    static int num =0;

    public static void ioIntensive(int i) throws InterruptedException {
        log.info(num + " starting i/o task {} ",i);
        Thread.sleep(Duration.ofSeconds(30));

        log.info(num + " ending i/o task {} ",i);
        num++;
    }
}
