package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: Payment
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 15:59
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Integer id;
    private String name;
    private String serial;

}
