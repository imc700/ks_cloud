package com.ks.ks_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KsEurekaApplication {
    //nothing here.just eureka.
    public static void main(String[] args) {
        SpringApplication.run(KsEurekaApplication.class, args);
    }

}
