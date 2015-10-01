package org.selwyn.backend.rain.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"org.selwyn.backend.rain"})
public class RainConfig {
    public static void main(String [] args) {
        ApplicationContext context = SpringApplication.run(RainConfig.class);
    }
}
