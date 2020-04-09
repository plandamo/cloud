package com.atguigu.sprincloud.controller;

import com.atguigu.sprincloud.lb.LoadBalancer;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.sprincloud.controller
 * @ClassName: ConsumerOrderController
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/7 14:53
 * @Version: 1.0
 */
@RestController
@Slf4j
public class ConsumerOrderController {
    String url = "http://CLOUD-PROVIDER-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancer loadBalancer;

    @PostMapping("/consumer/add")
    public CommonResult<Payment> insert(@RequestBody Payment payment){
        return restTemplate.postForObject(url+"/provider/add",payment,CommonResult.class);
    }

    @GetMapping("/consumer/getPaymentById/{id}")
    public  CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(url+"/provider/getPaymentById/"+id,CommonResult.class);
    }

    /**
     * @Author liujinshan
     * @Version  1.0
     * @Description 验证Ribbon 负载规则替换
     * @param id:
     * @Return com.atguigu.springcloud.entities.CommonResult<com.atguigu.springcloud.entities.Payment>
     * @Date 2020/4/9 15:47
     */
    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
        log.info(url+"/provider/getPaymentById/"+id);
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(url+"/provider/getPaymentById/"+id,CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        } else {
            return new CommonResult<>(444,"失败");
        }
    }


    @GetMapping("/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> list =  discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT-SERVICE");

        if (null == list || list.size()<0){
            return null;
        }
        ServiceInstance instance = loadBalancer.instance(list);
        URI uri = instance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }
}
