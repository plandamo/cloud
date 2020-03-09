package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 16:02
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentDao paymentDao;

    /**
     * @param payment
     * @Method 新增
     * @Author liujinshan
     * @Version 1.0
     * @Description No such property: code for class: Script1
     * @Return
     * @Exception
     * @Date 2020/3/6 16:06
     * @return
     */
    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    /**
     * @param id
     * @Method 根据id查询
     * @Author liujinshan
     * @Version 1.0
     * @Description No such property: code for class: Script1
     * @Return
     * @Exception
     * @Date 2020/3/6 16:24
     */
    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
