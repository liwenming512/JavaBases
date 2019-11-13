package com.mybatis.demo.model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/11/11.
 */
public enum OrgTypeEnum {

    FENBO(11601, "分拨"),
    WANGDIAN(11603, "网点"),
    GONGSI(11602, "公司");

    private Integer key;
    private String value;
    private static Map<Integer, OrgTypeEnum> orgTypeEnumMap = new HashMap<>();

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OrgTypeEnum(Integer key, String value){
        this.key = key;
        this.value = value;
    }

    /**
     *
     * @Title: getSexEnumByKey
     * @Description: 依据key获取枚举
     * @param key
     * @return
     */
    public static OrgTypeEnum getSexEnumByKey(Integer key) {
        return orgTypeEnumMap.get(key);
    }

    static {
        for (OrgTypeEnum sexEnum : OrgTypeEnum.values()) {
            orgTypeEnumMap.put(sexEnum.getKey(), sexEnum);
        }
    }
}
