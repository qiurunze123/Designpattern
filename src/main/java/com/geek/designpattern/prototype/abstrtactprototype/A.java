package com.geek.designpattern.prototype.abstrtactprototype;

/**
 * 抽象类实现原型模式
 */
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
