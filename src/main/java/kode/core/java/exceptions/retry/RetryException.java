package kode.core.java.exceptions.retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.time.LocalDateTime;

@Component
public class RetryException {
    static int count =0;

    @Retryable(maxAttempts = 4,
            value = {SQLException.class},
            backoff = @Backoff(delay = 1000,multiplier = 3))
    public void call() throws SQLException {
        System.out.println("called times: "+ count + "  -"+ LocalDateTime.now());
        if(count==4){
           return;
        }
        count++;
        throw new SQLException();
    }

    @Recover
    public  void recover() {
        System.out.println("called recovery method after calling call method" + count);
    }
    @Recover
    public  void recover1(SQLException ex) {
        System.out.println("called recovery1 method after calling call method" + count);
    }
}
