package com.atguigu.springcloud.juc.study;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import lombok.Getter;

/**
 * @author ：wangsg
 * @date ： 2020/3/24 11:12
 */
public enum CityEunm {
    ONE(1,"北京"),TWO(2,"shanghai"),THERE(3,"guangzhou");
    @Getter private Integer retCode ;
    @Getter private  String retCityName;

    CityEunm(Integer retCode, String retCityName) {
        this.retCode = retCode;
        this.retCityName = retCityName;
    }
    public static CityEunm cityEunm(int index){
        CityEunm[] values = CityEunm.values();
        for (CityEunm value : values) {
            if(index==value.getRetCode()){
                return value;
            }
        }
        return  null;
    }
}
