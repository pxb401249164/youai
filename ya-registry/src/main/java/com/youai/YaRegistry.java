package com.youai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @date 2019/11/15-16:23
 */
@SpringBootApplication
@EnableEurekaServer
public class YaRegistry {
    public static void main(String[] args) {
        SpringApplication.run(YaRegistry.class, args);
    }

}
