package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: PaymentController
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 16:04
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/provider/add")
    public CommonResult<Payment> insert(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        if (result > 0) {
            return  new CommonResult(200,"插入成功:servicePort="+servicePort,result);
        } else {
            return new CommonResult(500,"插入失败:servicePort="+servicePort,null);
        }
    }


    @GetMapping("/provider/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Integer id){

        Payment payment1 = paymentService.getPaymentById(id);

        if (!payment1.equals(null)) {
            return  new CommonResult(200,"查询成功:servicePort="+servicePort,payment1);
        } else {
            return  new CommonResult(500,"查询失败:servicePort="+servicePort,payment1);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("****element: " +element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance:instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return servicePort;
    }
}
