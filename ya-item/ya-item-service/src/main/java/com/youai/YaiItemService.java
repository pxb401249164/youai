package com.youai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @date 2019/11/15-23:20
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.youai.item.mapper")
public class YaiItemService {
    public static void main(String[] args) {
        SpringApplication.run(YaiItemService.class, args);
    }
}
