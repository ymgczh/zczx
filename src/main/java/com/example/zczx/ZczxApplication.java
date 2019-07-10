package com.example.zczx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZczxApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZczxApplication.class, args);
    }

}
