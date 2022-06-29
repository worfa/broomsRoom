package org.electricBrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@EnableWebFluxSecurity
@SpringBootApplication
public class GatewayApp {
    public static void main(String[] args){
        SpringApplication.run(GatewayApp.class, args);
    }
}
