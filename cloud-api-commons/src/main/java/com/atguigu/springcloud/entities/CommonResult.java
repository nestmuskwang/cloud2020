package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：wangsg
 * @date ： 2020/3/16 18:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private  String message;
    private  T      data;

    public  CommonResult(Integer code,String message  ){
        this(code,message,null);
    }
}
