package com.geekq.design.pattern.structural.adapter.objectadapter;


/**
 * Created by geekq
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
