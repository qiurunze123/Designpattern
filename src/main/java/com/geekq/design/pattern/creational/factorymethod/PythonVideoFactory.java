package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
