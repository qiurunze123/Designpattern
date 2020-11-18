package com.fengsao.pattern.design.principle.compositionaggregation;

/**
 * Created by geekq
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
