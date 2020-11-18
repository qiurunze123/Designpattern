package com.fengsao.pattern.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
