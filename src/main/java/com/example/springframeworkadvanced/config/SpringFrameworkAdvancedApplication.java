package com.example.springframeworkadvanced.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springframeworkadvanced")
public class SpringFrameworkAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkAdvancedApplication.class, args);
    }

}
