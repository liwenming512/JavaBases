package com.mybatis.demo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/11/17.
 */
public enum StatusTypeEnum {

    TONGGUO("通过"),
    BOHUI("驳回");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    StatusTypeEnum(String value){
        this.value = value;
    }
}
