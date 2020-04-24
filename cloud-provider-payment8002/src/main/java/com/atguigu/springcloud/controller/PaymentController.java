package com.atguigu.springcloud.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.druid.support.opds.udf.ExportSelectListColumns;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentSerive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：wangsg
 * @date ： 2020/3/16 9:59
 */
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentSerive paymentSerive;
    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment ){
        int result=paymentSerive.create(payment);
        log.info("插入结果"+payment);
        log.info("aaaaaaa");
        System.out.println("aaaaaa");
        if (result>0){
            return new CommonResult(200,"插入成功+serverPort:"+serverPort,result);
        } else {
            return  new CommonResult(444,"失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id ){
        Payment payment=paymentSerive.getPaymentById(id);
        log.info("插入结果"+payment);
        System.out.println("aaaaaa");
        if (payment!=null){
            return new CommonResult(200,"查询成功+serverPort:"+serverPort,payment);}
        else {
            return  new CommonResult(444,"没有记录"+id,null);
        }
    }
}
