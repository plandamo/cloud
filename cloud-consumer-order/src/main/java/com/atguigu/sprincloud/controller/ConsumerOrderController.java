package com.atguigu.sprincloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    @PostMapping("/consumer/add")
    public CommonResult<Payment> insert(@RequestBody Payment payment){
        return restTemplate.postForObject(url+"/provider/add",payment,CommonResult.class);
    }

    @GetMapping("/consumer/getPaymentById/{id}")
    public  CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(url+"/provider/getPaymentById/"+id,CommonResult.class);
    }
}
