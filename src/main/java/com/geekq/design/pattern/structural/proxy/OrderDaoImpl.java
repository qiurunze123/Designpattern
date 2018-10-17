package com.geekq.design.pattern.structural.proxy;

/**
 * Created by geekq
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
