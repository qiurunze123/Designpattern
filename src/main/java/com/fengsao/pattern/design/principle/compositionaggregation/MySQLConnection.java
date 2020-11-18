package com.fengsao.pattern.design.principle.compositionaggregation;

/**
 * Created by geekq
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
