package com.geek.designpattern.decorator.v2;

public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake ;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+"销售价格："+aBattercake.cost());
    }
}
