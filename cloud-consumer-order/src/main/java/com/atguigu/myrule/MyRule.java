package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ProjectName:    cloud
 * Package:        com.atguigu.myrule
 * ClassName:      Ribbon 负载规则替换
 * Author:     liujinshan
 * Description:
 * Date:    2020/4/8 17:39
 * Version:    1.0
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRulefl(){
        //随机
        return new RandomRule();
    }
}
