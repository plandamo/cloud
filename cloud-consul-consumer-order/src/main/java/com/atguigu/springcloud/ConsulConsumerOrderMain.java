package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: ConsulConsumerOrderMain
 * @Author: liujinshan
 * @Description: springCloud 整合 consul 客户端
 * @Date: 2020/3/9 14:38
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumerOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerOrderMain.class,args);
    }
}
