package com.geekq.design.pattern.creational.factorymethod;

/**
 * Created by geekq
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
