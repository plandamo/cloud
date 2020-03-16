package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.config
 * @ClassName: FeignConfig
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/12 16:02
 * @Version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
