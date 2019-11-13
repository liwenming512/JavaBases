package com.mybatis.demo.typehandler;

import com.mybatis.demo.model.OrgTypeEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2019/11/11.
 */

/* 数据库中的数据类型 */
//@MappedJdbcTypes(JdbcType.INTEGER)
/* 转化后的数据类型 */
//@MappedTypes(value = OrgTypeEnumHandler.class)
public class OrgTypeEnumHandler extends BaseTypeHandler<OrgTypeEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, OrgTypeEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getKey());
    }

    @Override
    public OrgTypeEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("columnName执行我");
        Integer key = rs.getInt(columnName);
        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的key值，定位SexEnum子类
            return OrgTypeEnum.getSexEnumByKey(key);
        }
    }

    @Override
    public OrgTypeEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型，本例子中数据库中存放String类型
        Integer key = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的key值，定位SexEnum子类
            return OrgTypeEnum.getSexEnumByKey(key);
        }
    }

    @Override
    public OrgTypeEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型，本例子中数据库中存放String类型
        Integer key = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的key值，定位SexEnum子类
            return OrgTypeEnum.getSexEnumByKey(key);
        }
    }
}
