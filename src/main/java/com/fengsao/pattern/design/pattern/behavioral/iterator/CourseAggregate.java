package com.fengsao.pattern.design.pattern.behavioral.iterator;

/**
 * Created by geekq.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
