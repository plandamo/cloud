package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: ConfigClientMain3355
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/16 11:57
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class,args);
    }

}
