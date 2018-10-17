package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
