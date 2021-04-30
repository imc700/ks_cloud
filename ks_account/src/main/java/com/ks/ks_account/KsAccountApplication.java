package com.ks.ks_account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableFeignClients
@EnableJpaAuditing
@SpringBootApplication
@EnableDiscoveryClient
public class KsAccountApplication {
    //2021年4月25日22:19:24
    public static void main(String[] args) {
        SpringApplication.run(KsAccountApplication.class, args);
    }

}
