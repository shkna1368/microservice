package com.shabab.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy        // Enable Zuul
@EnableEurekaClient        // It acts as a eureka client
public class GetwayApplication {




    public static void main(String[] args) {
        SpringApplication.run(GetwayApplication.class, args);
    }


}
