package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ProjectName:    cloud
 * Package:        com.atguigu.springcloud
 * ClassName:      ProviderHystrixPayment8001
 * Author:     liujinshan
 * Description:
 * Date:    2020/4/10 16:07
 * Version:    1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderHystrixPayment8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixPayment8001.class,args);
    }
}