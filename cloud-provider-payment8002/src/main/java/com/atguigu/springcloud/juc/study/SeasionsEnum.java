package com.atguigu.springcloud.juc.study;

import lombok.Getter;

/**
 * @author ：wangsg
 * @date ： 2020/3/23 23:33
 */

public enum SeasionsEnum {
    one(1,"春"),tow(2,"夏")
    ,THERY(3,"球");
   @Getter private  Integer  retCode;
   @Getter private  String  retMesagee;

    SeasionsEnum(Integer retCode, String retMesagee) {
        this.retCode = retCode;
        this.retMesagee = retMesagee;
    }
    public static SeasionsEnum forEach_Seasion(int index){
        SeasionsEnum[] values = SeasionsEnum.values();
        for (SeasionsEnum value : values) {
            if(index==value.getRetCode()){
                return value;
            }
        }
        return  null;
    }
}
