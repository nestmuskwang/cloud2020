package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：wangsg
 * @date ： 2020/3/16 18:13
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80{
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
