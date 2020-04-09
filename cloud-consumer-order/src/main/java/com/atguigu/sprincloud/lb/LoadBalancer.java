package com.atguigu.sprincloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * ProjectName:    cloud
 * Package:        com.atguigu.sprincloud.lb
 * ClassName:      LoadBalancer
 * Author:     liujinshan
 * Description:
 * Date:    2020/4/8 20:16
 * Version:    1.0
 */
public interface LoadBalancer {

    /**
     * @Author liujinshan
     * @Version  1.0
     * @Description 根据下标获取该下标对应的服务
     * @param serviceInstances:
     * @Return org.springframework.cloud.client.ServiceInstance
     * @Date 2020/4/8 20:27
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
