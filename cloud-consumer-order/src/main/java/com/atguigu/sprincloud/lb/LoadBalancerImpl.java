package com.atguigu.sprincloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ProjectName:    cloud
 * Package:        com.atguigu.sprincloud.lb
 * ClassName:      LoadBalancerImpl
 * Author:     liujinshan
 * Description: 手写 Ribbon 的轮询算法
 * Date:    2020/4/8 20:17
 * Version:    1.0
 */
@Component
public class LoadBalancerImpl implements LoadBalancer {


    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * @Author liujinshan
     * @Version  1.0
     * @Description 获取第几次访问次数 通过 compareAndSet 实现自旋锁的形式。
     * @param :
     * @Return int
     * @Date 2020/4/8 20:24
     */
    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >=214783647 ? 0 :current+1;
        } while (!this.atomicInteger.compareAndSet(current,next));
        return next;
    }


    /**
     * @Author liujinshan
     * @Version  1.0
     * @Description 根据下标获取该下标对应的服务
     *  负载均衡算法： rest接口第几次请求 % 服务器数量 = 实际服务器位置下标 ，每次重启后 rest 接口计数从 1 开始。
     * @param serviceInstances:
     * @Return org.springframework.cloud.client.ServiceInstance
     * @Date 2020/4/8 20:27
     */
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
