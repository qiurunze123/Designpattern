package com.fengsao.pattern.guavaeventbus;

/**
 * @author 轩北
 * @date 2020/11/24 10:45 上午
 */
public class OrderEventListener {


    @Subscribe
    public void dealWithEvent(OrderMessage event){
        System.out.println("我收到了您的命令，命令内容为： " + event);
    }

    @Subscribe
    public void dealWithEvent2(String event){
        System.out.println("我收到了您的命令，命令内容为2： " + event);
    }
}
