package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: CloudEuerkaServer
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/7 21:43
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEuerkaServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudEuerkaServer.class,args);
    }

}
