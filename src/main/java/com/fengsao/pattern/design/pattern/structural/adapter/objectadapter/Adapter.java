package com.fengsao.pattern.design.pattern.structural.adapter.objectadapter;

/**
 * Created by geekq
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
