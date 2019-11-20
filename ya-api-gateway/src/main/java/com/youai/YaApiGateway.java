package com.youai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: HuYi.Zhang
 * @create: 2018-05-24 11:02
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class YaApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(YaApiGateway.class, args);
    }
}
