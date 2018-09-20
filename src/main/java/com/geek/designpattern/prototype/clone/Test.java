package com.geek.designpattern.prototype.clone;

import java.util.Date;

/**
 * cloneable  接口 使用原型模式要注意是否对象是你想要得
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L) ;
        Pig pig1 = new Pig("配奇",birthday) ;
        Pig pig2 = (Pig)pig1.clone() ;
        //设置之后clone的对象里面的值也变化了 因为clone的date对象是同一个 浅克隆
        pig1.getBirthday().setTime(66666666L);
        System.out.println(pig1);
        System.out.println(pig2);

    }
}
