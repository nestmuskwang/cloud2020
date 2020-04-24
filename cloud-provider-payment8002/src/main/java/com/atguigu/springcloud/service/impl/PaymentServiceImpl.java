package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentSerive;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：wangsg
 * @date ： 2020/3/16 9:55
 */
@Service
public class PaymentServiceImpl implements PaymentSerive {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
