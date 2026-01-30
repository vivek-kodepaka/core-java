package kode.core.java.exceptions.retry;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.stereotype.Controller;

@Configuration
@EnableRetry
@ComponentScan(basePackages = "kode.core.java.exceptions.retry")
public class SpringConfig {
}
