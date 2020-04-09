package com.atguigu.sprincloud.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.sprincloud.Config
 * @ClassName: RestTemplateConfig
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/7 14:54
 * @Version: 1.0
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    /*@LoadBalanced*/
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
