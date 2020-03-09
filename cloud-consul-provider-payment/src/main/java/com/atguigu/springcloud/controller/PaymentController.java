package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

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
}
