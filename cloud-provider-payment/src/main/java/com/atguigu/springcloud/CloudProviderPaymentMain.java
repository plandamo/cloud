package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: CloudProviderPaymentMain
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 13:48
 * @Version: 1.0
 */
@MapperScan("com.atguigu.springcloud.dao") //扫描的mapper
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentMain.class,args);
    }
}
