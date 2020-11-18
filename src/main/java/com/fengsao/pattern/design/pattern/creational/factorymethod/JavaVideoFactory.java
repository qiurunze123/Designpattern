package com.fengsao.pattern.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
