package com.geekq.design.pattern.creational.prototype.abstractprototype;

/**
 * Created by geekq
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
