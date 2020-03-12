package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: CloudGateWayMain9527
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/12 13:53
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateWayMain9527.class,args);
    }
}
