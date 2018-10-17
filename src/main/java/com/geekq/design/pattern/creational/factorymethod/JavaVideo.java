package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
