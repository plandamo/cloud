package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.config
 * @ClassName: GateWayConfig
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/12 14:15
 * @Version: 1.0
 */
@Configuration
public class GateWayConfig {


    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes  = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
}
