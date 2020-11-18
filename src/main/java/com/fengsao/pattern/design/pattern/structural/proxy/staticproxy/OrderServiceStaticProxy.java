package com.fengsao.pattern.design.pattern.structural.proxy.staticproxy;

import com.geekq.design.pattern.structural.proxy.IOrderService;
import com.geekq.design.pattern.structural.proxy.Order;
import com.geekq.design.pattern.structural.proxy.OrderServiceImpl;
import com.geekq.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * Created by geekq
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
