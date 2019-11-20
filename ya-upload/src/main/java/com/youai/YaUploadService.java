package com.youai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @date 2019/11/19-15:58
 */
@SpringBootApplication
@EnableEurekaClient
public class YaUploadService {
    public static void main(String[] args) {
        SpringApplication.run(YaUploadService.class, args);
    }
}
