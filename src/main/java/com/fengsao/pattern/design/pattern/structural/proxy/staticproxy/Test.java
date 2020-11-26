package com.fengsao.pattern.design.pattern.structural.proxy.staticproxy;


import com.fengsao.pattern.design.pattern.structural.proxy.Order;

/**
 * Created by geekq
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
