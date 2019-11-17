package com.mybatis.demo.model;

/**
 * Created by Administrator on 2019/11/13.
 */
public enum OrgTypeEnum {

    FENBO("分拨"),
    WANGDIAN("网点"),
    GONGSI("公司");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OrgTypeEnum(String value){
        this.value = value;
    }
}
