package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentService
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 16:02
 * @Version: 1.0
 */
public interface PaymentService {

    /**
     * @Method 新增
     * @Author liujinshan
     * @Version  1.0
     * @Description
     No such property: code for class: Script1
     * @Return 
     * @Exception 
     * @Date 2020/3/6 16:11
     */
    int insert(Payment payment);

    /**
     * @Method 根据id查询
     * @Author liujinshan
     * @Version  1.0
     * @Description
     No such property: code for class: Script1
     * @Return
     * @Exception
     * @Date 2020/3/6 16:24
     */
    Payment getPaymentById(Integer id);
    
}
