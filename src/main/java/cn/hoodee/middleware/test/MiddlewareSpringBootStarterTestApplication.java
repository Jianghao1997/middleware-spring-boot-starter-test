package cn.hoodee.middleware.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"cn.hoodee.middleware"})
public class MiddlewareSpringBootStarterTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddlewareSpringBootStarterTestApplication.class, args);
    }

}
