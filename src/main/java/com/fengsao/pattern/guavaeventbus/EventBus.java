package com.fengsao.pattern.guavaeventbus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author 轩北
 * @date 2020/11/26 1:56 下午
 */
public class EventBus {

    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus(){
        this(MoreExecutors.directExecutor());
    }
    protected EventBus(Executor executor){
        this.executor =executor;
    }

    public void register(Object object){
        registry.register(object);
    }

    public void unRegister(Object object){
        registry.unRegister(object);
    }

    public void post(Object event){
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);

        for(ObserverAction observerAction:observerActions){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }






}
