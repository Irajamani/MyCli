package com.rajamani.mycli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MycliApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MycliApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(MycliApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }

}
