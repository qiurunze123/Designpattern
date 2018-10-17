package com.geekq.design.pattern.behavioral.strategy;

/**
 * Created by geekq
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
