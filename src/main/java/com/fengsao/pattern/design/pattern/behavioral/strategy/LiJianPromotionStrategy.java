package com.fengsao.pattern.design.pattern.behavioral.strategy;

/**
 * Created by geekq
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
