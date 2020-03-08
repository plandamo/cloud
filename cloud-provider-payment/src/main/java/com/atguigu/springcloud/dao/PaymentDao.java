package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.dao
 * @ClassName: PaymentDao
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 16:02
 * @Version: 1.0
 */
@Repository
public interface PaymentDao {

    int insert(Payment payment);

    Payment getPaymentById(@Param("id") Integer id);

}
