package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：wangsg
 * @date ： 2020/5/13 7:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMian80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMian80.class, args);
    }
}
