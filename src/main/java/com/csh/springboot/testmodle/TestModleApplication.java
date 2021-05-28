package com.csh.springboot.testmodle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestModleApplication {
    @Value("${test.long}")
    private Long testLong;

    public static void main(String[] args) {
        SpringApplication.run(TestModleApplication.class, args);
    }

    @Bean
    public void testLong(){
        System.out.println(testLong);
    }
}
