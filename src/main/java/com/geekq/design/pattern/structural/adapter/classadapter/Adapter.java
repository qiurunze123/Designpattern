package com.geekq.design.pattern.structural.adapter.classadapter;

/**
 * Created by geekq
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
