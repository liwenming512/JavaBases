package com.mybatis.demo.model;

/**
 * Created by Administrator on 2019/11/13.
 */
public enum OrgTypeEnum implements Translatable {

    FENBO(11601, "分拨"),
    WANGDIAN(11603, "网点"),
    GONGSI(11602, "公司");

    private String nameCn;
    private int code;

    OrgTypeEnum(int code, String nameCn){
        this.code = code;
        this.nameCn = nameCn;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getNameCn() {
        return this.nameCn;
    }
}
