package com.fengsao.pattern.design.principle.singleresponsibility;

/**
 * Created by geekq
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
