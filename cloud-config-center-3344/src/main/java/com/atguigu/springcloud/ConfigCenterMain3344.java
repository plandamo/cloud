package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: ConfigCenterMain3344
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/13 15:19
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }

}
