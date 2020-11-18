package com.fengsao.pattern.design.pattern.structural.adapter.classadapter;

/**
 * Created by geekq
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
