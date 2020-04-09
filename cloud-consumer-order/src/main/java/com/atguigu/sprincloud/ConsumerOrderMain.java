package com.atguigu.sprincloud;

import com.atguigu.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
//@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT-SERVICE",configuration = MyRule.class)  Ribbon 负载规则替换
public class ConsumerOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain.class,args);
    }
}
