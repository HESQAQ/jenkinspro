package com.example.springcloud_1_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Springcloud1EurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1EurekaserverApplication.class, args);
    }
}
