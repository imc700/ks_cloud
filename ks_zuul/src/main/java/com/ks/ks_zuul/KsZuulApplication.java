package com.ks.ks_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@Ena
@EnableDiscoveryClient

public class KsZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(KsZuulApplication.class, args);
    }

}
