package com.fengsao.pattern.guavaeventbus;

/**
 * @author 轩北
 * @date 2020/11/24 10:45 上午
 */
public class OrderEventListener1 {


    @Subscribe
    private void dealWith(String event){
        System.out.println("我收到了您的命令，命令内容为： " + event);
    }
}
