package org.electricBrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IdeaApp {
    public static void main(String[] args) {
        SpringApplication.run(IdeaApp.class, args);
    }
}
