package com.fengsao.pattern.guavaeventbus;

/**
 * @author 轩北
 * @date 2020/11/26 2:05 下午
 */
public class Demo {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new OrderEventListener());
        eventBus.register(new OrderEventListener1());
        OrderMessage msg =new OrderMessage();
        msg.setOrderContent(9L);
        eventBus.post(msg);
    }
}
