package com.mybatis.demo.model;

/**
 * Created by Administrator on 2019/11/13.
 */
public enum OrgTypeEnum implements Translatable {

    FENBO("分拨"),
    WANGDIAN("网点"),
    GONGSI("公司");

<<<<<<< Updated upstream
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
=======
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
>>>>>>> Stashed changes
}
