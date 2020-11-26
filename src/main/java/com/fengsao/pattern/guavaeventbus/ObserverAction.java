package com.fengsao.pattern.guavaeventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 轩北
 * @date 2020/11/25 8:57 下午
 * 存储 类对象 和 方法
 */
public class ObserverAction {

    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        /**
         * 设置setAccessible 可以解除私有属性的访问限制
         */
        this.method.setAccessible(true);
    }

    //event 是method 的 方法的参数
    public void execute(Object  event ){
        try {
            method.invoke(target,event);
        } catch (InvocationTargetException  | IllegalAccessException e )  {
            e.printStackTrace();
        }
    }
}
