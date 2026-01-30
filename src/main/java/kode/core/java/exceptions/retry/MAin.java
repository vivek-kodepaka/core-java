package kode.core.java.exceptions.retry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MAin {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);
        RetryException retryException = ctx.getBean(RetryException.class);
        retryException.call();
    }
}
