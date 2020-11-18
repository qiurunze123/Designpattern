package com.fengsao.pattern.design.principle.dependenceinversion;

/**
 * Created by geekq
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("geekq在学习Python课程");
    }
}
