package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：wangsg
 * @date ： 2020/3/16 9:54
 */
public interface PaymentSerive {
    public  int create(Payment payment );
    public Payment getPaymentById(@Param("id") long id  );
}
