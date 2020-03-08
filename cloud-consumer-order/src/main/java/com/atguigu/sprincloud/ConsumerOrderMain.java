package com.atguigu.sprincloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.sprincloud
 * @ClassName: ConsumerOrderMain
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/7 14:49
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain.class,args);
    }
}
