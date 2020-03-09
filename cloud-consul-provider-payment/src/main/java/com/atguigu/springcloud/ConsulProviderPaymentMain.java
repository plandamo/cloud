package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: ConsulProviderPaymentMain
 * @Author: liujinshan
 * @Description: springCloud 整合 consul 服务提供端
 * @Date: 2020/3/9 14:22
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.springcloud.dao") //扫描的mapper
public class ConsulProviderPaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderPaymentMain.class,args);
    }
}
