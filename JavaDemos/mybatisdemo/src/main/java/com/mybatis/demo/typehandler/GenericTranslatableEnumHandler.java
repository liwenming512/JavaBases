package com.mybatis.demo.typehandler;

import com.mybatis.demo.model.Translatable;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Administrator on 2019/11/13.
 */
public class GenericTranslatableEnumHandler<T extends Enum<T> & Translatable> extends BaseTypeHandler<T> {

    private Class<T> type;

    public GenericTranslatableEnumHandler(Class<T> type) {
        if (Objects.isNull(type)) {
            throw new IllegalArgumentException("type should not be null.");
        }
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getCode());
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int code = rs.getInt(columnName);
        Optional<T> first = Arrays.stream(type.getEnumConstants())
                .filter(ele -> ele.getCode() == code).findFirst();
        if (first.isPresent()) {
            return first.get();
        } else {
            throw new SQLException("Illegal argument " + code + " for " + type.getCanonicalName());
        }
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int code = rs.getInt(columnIndex);
        Optional<T> first = Arrays.stream(type.getEnumConstants())
                .filter(ele -> ele.getCode() == code).findFirst();
        if (first.isPresent()) {
            return first.get();
        } else {
            throw new SQLException("Illegal argument " + code + " for " + type.getCanonicalName());
        }
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int code = cs.getInt(columnIndex);
        Optional<T> first = Arrays.stream(type.getEnumConstants())
                .filter(ele -> ele.getCode() == code).findFirst();
        if (first.isPresent()) {
            return first.get();
        } else {
            throw new SQLException("Illegal argument " + code + " for " + type.getCanonicalName());
        }
    }
}
