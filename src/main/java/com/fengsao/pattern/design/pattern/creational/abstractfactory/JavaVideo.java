package com.fengsao.pattern.design.pattern.creational.abstractfactory;

/**
 * Created by geekq
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
