package com.fengsao.pattern.design.principle.compositionaggregation;

/**
 * Created by geekq
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
