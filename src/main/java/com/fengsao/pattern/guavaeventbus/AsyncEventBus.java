package com.fengsao.pattern.guavaeventbus;

import java.util.concurrent.Executor;

/**
 * @author 轩北
 * @date 2020/11/26 2:03 下午
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor){
        super(executor);
    }
}
