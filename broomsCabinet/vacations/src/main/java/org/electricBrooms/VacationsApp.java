package org.electricBrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VacationsApp {
    public static void main(String[] args){
        SpringApplication.run(VacationsApp.class, args);
    }
}
