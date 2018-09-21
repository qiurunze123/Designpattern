package com.geek.designpattern.decorator.v2;

/**
 * 蛋装饰者
 */
public class EggDecorator  extends  AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋！";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
