package com.geek.designpattern.decorator.v2;

/**
 * 抽象的装饰者类 如果要保证子类必须实现某个场景的话 可以变成抽象类 否则的话没有什么意义
 */
public class AbstractDecorator extends  ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }

//    protected abstract  void doSomething();
    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
