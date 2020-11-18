package com.fengsao.pattern.design.pattern.structural.adapter.classadapter;

/**
 * Created by geekq
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
