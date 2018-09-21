package com.geek.designpattern.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
