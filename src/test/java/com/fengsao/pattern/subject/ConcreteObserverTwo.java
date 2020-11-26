package com.fengsao.pattern.subject;

/**
 * @author 轩北
 * @date 2020/11/25 3:33 下午
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserverTwo is notified 。。。。。");
    }
}
