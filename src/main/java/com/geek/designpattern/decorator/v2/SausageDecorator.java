package com.geek.designpattern.decorator.v2;

/**
 * 香肠装饰者
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
