package com.geek.designpattern.decorator.v1;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"x销售价格："+battercake.cost());
        BattercakeWithEgg battercakewithEgg = new BattercakeWithEgg();
        System.out.println(battercakewithEgg.getDesc()+"x销售价格："+battercakewithEgg.cost());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+"x销售价格："+battercakeWithEggSausage.cost());

    }


}
