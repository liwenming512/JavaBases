package com.mybatis.demo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/11/6.
 */
public class LocationVo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *站点唯一编码
     */
    private String code;

    /**
     *站点名称
     */
    private String name;

    /**
     *站点类型
     */
    private OrgTypeEnum orgType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgTypeEnum getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgTypeEnum orgType) {
        this.orgType = orgType;
    }
}
