package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: CommonResult
 * @Author: liujinshan
 * @Description:
 * @Date: 2020/3/6 14:01
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer errorCode;
    private String errorMassage;
    private T data;

    public CommonResult(int errorCode, String errorMassage) {
        errorCode = this.errorCode;
        errorMassage = this.errorMassage;
    }
}
