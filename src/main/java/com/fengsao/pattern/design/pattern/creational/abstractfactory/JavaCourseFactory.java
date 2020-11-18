package com.fengsao.pattern.design.pattern.creational.abstractfactory;

/**
 * Created by geekq
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
