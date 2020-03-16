package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud
 * @ClassName: OrderFeignMain80
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/12 15:52
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
